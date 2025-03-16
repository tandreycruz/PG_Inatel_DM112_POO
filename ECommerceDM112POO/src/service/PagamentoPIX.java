package service;

import interfaces.IPagamento;

public class PagamentoPIX implements IPagamento
{
	@Override
	public void efetuarPagamento(Long idPedido, Double valorTotal)
	{
		System.out.println("+ Registro do Pagamento: (Pedido " + idPedido + ") Pagamento Efetuado com PIX");
	}

	@Override
	public String obterFormaPagamento()
	{
		return "PIX";
	}
}
