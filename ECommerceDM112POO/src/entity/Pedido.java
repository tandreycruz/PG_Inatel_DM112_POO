package entity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import interfaces.IPagamento;

public class Pedido
{
	private Long idPedido;

	private Date dtPedido;

	private String formaPagamento;

	private Double valorTotal;

	private List<Produto> vProduto = new ArrayList<Produto>();

	public Pedido(Long idPedido, Date dtPedido)
	{
		this.idPedido = idPedido;
		this.dtPedido = dtPedido;
	}

	public void adicionarProduto(Produto produto)
	{
		if (this.vProduto == null || this.vProduto.size() <= 0)
		{
			System.out.println("# PEDIDO " + this.idPedido);
		}
		System.out.println("+ Produto '" + produto.getNmProduto() + "' adicionado ao pedido " + this.idPedido + ".");
		this.vProduto.add(produto);
	}

	private Double calcularValorTotal()
	{
		Double total = 0.0;
		for (Produto produto : vProduto)
		{
			total = total + produto.getPreco();
		}
		DecimalFormat df = new DecimalFormat("#.00");
		return Double.parseDouble(df.format(total).replace(',', '.'));
	}

	public void finalizarPedido(IPagamento iPagamento)
	{
		this.formaPagamento = iPagamento.obterFormaPagamento();
		this.valorTotal = calcularValorTotal();
		// EXIBIR VALOR TOTAL DO PEDIDO E REGISTRO DO PAGAMENTO
		System.out.println(" ");
		System.out.println("+ Calcular Valor Total (Pedido " + this.idPedido + "): " + this.valorTotal);
		iPagamento.efetuarPagamento(this.idPedido, this.valorTotal);
		System.out.println("+ Finalizar pedido e gerar fatura.");
		// GERAR FATURA
		new Fatura(new Date(), this);
	}

	public Long getIdPedido()
	{
		return idPedido;
	}

	public void setIdPedido(Long idPedido)
	{
		this.idPedido = idPedido;
	}

	public Date getDtPedido()
	{
		return dtPedido;
	}

	public void setDtPedido(Date dtPedido)
	{
		this.dtPedido = dtPedido;
	}

	public String getFormaPagamento()
	{
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento)
	{
		this.formaPagamento = formaPagamento;
	}

	public Double getValorTotal()
	{
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal)
	{
		this.valorTotal = valorTotal;
	}

	public List<Produto> getvProduto()
	{
		return vProduto;
	}

	public void setvProduto(List<Produto> vProduto)
	{
		this.vProduto = vProduto;
	}
}
