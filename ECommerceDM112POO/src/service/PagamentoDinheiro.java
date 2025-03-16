package service;

import interfaces.IPagamento;

public class PagamentoDinheiro implements IPagamento
{
	@Override
	public void efetuarPagamento(Long idPedido, Double valorTotal)
	{
		System.out.println("+ Registro do Pagamento: (Pedido " + idPedido + ") Pagamento Efetuado com Dinheiro");
	}

	@Override
	public String obterFormaPagamento()
	{
		return "Dinheiro";
	}
}
