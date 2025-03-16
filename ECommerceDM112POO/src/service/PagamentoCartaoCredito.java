package service;

import interfaces.IPagamento;

public class PagamentoCartaoCredito implements IPagamento
{
	@Override
	public void efetuarPagamento(Long idPedido, Double valorTotal)
	{
		System.out.println("+ Registro do Pagamento: (Pedido " + idPedido + ") Pagamento Efetuado com Cartão de Crédito");
	}

	@Override
	public String obterFormaPagamento()
	{
		return "Cartão de Crédito";
	}
}
