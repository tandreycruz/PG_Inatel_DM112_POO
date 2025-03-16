package service;

import interfaces.IPagamento;

public class PagamentoBoleto implements IPagamento
{
	@Override
	public void efetuarPagamento(Long idPedido, Double valorTotal)
	{
		System.out.println("+ Registro do Pagamento: (Pedido " + idPedido + ") Pagamento Efetuado com Boleto");
	}

	@Override
	public String obterFormaPagamento()
	{
		return "Boleto";
	}
}
