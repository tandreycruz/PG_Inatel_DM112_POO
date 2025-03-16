package service;

import java.util.Date;

import entity.Categoria;
import entity.Pedido;
import entity.Produto;

public class ComercioEletronicoMain
{
	public static void main(String[] args)
	{
		// CATEGORIAS DE PRODUTOS
		Categoria categoriaEletronico = new Categoria(1, "Eletrônicos");
		Categoria categoriaConstrucao = new Categoria(2, "Construção");
		Categoria categoriaCasaMesaBanho = new Categoria(3, "Casa, Mesa & Banho");
		// OUTRAS CATEGORIAS PARA TESTES
		// Categoria categoriaAlimento = new Categoria(4, "Alimentos");
		//
		// PRODUTOS
		Produto produtoNotebook = new Produto("computador", 4230.50, categoriaEletronico);
		Produto produtoTinta = new Produto("tinta", 65.80, categoriaConstrucao);
		Produto produtoToalha = new Produto("toalha", 23.55, categoriaCasaMesaBanho);
		Produto produtoCortina = new Produto("cortina", 85.30, categoriaCasaMesaBanho);
		// OUTROS PRODUTOS PARA TESTES
		// Produto produtoArroz = new Produto("arroz", 4.99, categoriaAlimento);
		//
		// FORMAS DE PAGAMENTO
		PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito();
		PagamentoPIX pagamentoPIX = new PagamentoPIX();
		// OUTRAS FORMAS DE PAGAMENTO PARA TESTES
		// PagamentoDinheiro pagamentoDinheiro = new PagamentoDinheiro();
		// PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
		// PagamentoCartaoDebito pagamentoCartaoDebito = new PagamentoCartaoDebito();
		//
		// PEDIDOS
		Pedido pedido1 = new Pedido(1L, new Date());
		pedido1.adicionarProduto(produtoNotebook);
		pedido1.adicionarProduto(produtoTinta);
		pedido1.finalizarPedido(pagamentoCartaoCredito);
		//
		// OUTROS PEDIDOS PARA TESTES
		Pedido pedido2 = new Pedido(2L, new Date());
		pedido2.adicionarProduto(produtoToalha);
		pedido2.adicionarProduto(produtoCortina);
		pedido2.finalizarPedido(pagamentoPIX);
		//
		// Pedido pedido3 = new Pedido(3L, new Date());
		// pedido3.adicionarProduto(produtoArroz);
		// pedido3.finalizarPedido(pagamentoDinheiro);
		//
		// Pedido pedido4 = new Pedido(4L, new Date());
		// pedido4.adicionarProduto(produtoTinta);
		// pedido4.adicionarProduto(produtoToalha);
		// pedido4.adicionarProduto(produtoCortina);
		// pedido4.finalizarPedido(pagamentoBoleto);
	}
}
