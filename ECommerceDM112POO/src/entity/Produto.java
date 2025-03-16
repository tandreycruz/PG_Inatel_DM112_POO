package entity;

public class Produto
{
	private String nmProduto;

	private double preco;

	private Categoria categoria;

	public Produto(String nmProduto, double preco, Categoria categoria)
	{
		this.nmProduto = nmProduto;
		this.preco = preco;
		this.categoria = categoria;
	}

	public String getNmProduto()
	{
		return nmProduto;
	}

	public void setNmProduto(String nmProduto)
	{
		this.nmProduto = nmProduto;
	}

	public double getPreco()
	{
		return preco;
	}

	public void setPreco(double preco)
	{
		this.preco = preco;
	}

	public Categoria getCategoria()
	{
		return categoria;
	}

	public void setCategoria(Categoria categoria)
	{
		this.categoria = categoria;
	}
}
