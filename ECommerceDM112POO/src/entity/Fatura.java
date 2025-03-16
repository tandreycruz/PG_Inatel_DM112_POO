package entity;

import java.util.Date;

public class Fatura
{
	private Long idFatura;

	private Date dtFatura;

	private Pedido pedido;

	public Fatura(Date dtFatura, Pedido pedido)
	{
		this.idFatura = pedido.getIdPedido() * 10;
		this.dtFatura = dtFatura;
		this.pedido = pedido;
		gerarFatura(pedido, dtFatura);
	}

	private void gerarFatura(Pedido pedido, Date dtFatura)
	{
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("EMPRESA DE COMÉRCIO ELETRÔNICO LTDA");
		System.out.println("CNPJ 11.111.111.0001-11");
		System.out.println("********************** FATURA **********************");
		System.out.println("ID Fatura: " + this.idFatura);
		System.out.println("Data de Emissão: " + this.dtFatura);
		System.out.println("Pedido: " + pedido.getIdPedido());
		System.out.println("****************************************************");
		System.out.println("Itens do Pedido");
		System.out.println("****************************************************");
		for (Produto produto : pedido.getvProduto())
		{
			System.out.println("Produto: " + produto.getNmProduto() + " | Preço (R$): " + produto.getPreco());
		}
		System.out.println("****************************************************");
		System.out.println("Valor Total do Pedido (R$): " + pedido.getValorTotal());
		System.out.println("Forma de Pagamento: " + pedido.getFormaPagamento());
		System.out.println("****************************************************");
		System.out.println(" ");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
	}

	public Long getIdFatura()
	{
		return idFatura;
	}

	public void setIdFatura(Long idFatura)
	{
		this.idFatura = idFatura;
	}

	public Date getDtFatura()
	{
		return dtFatura;
	}

	public void setDtFatura(Date dtFatura)
	{
		this.dtFatura = dtFatura;
	}

	public Pedido getPedido()
	{
		return pedido;
	}

	public void setPedido(Pedido pedido)
	{
		this.pedido = pedido;
	}
}
