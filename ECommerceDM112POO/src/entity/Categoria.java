package entity;

public class Categoria
{
	private Integer idCategoria;

	private String nmCategoria;	

	public Categoria(Integer idCategoria, String nmCategoria)
	{
		this.idCategoria = idCategoria;
		this.nmCategoria = nmCategoria;
	}

	public Integer getIdCategoria()
	{
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria)
	{
		this.idCategoria = idCategoria;
	}

	public String getNmCategoria()
	{
		return nmCategoria;
	}

	public void setNmCategoria(String nmCategoria)
	{
		this.nmCategoria = nmCategoria;
	}
}
