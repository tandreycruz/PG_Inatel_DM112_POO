package interfaces;

public interface IPagamento
{
	public void efetuarPagamento(Long idPedido, Double valorTotal);

	public String obterFormaPagamento();
}
