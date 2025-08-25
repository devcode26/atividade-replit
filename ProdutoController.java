package Controller;

import Model.Produto;
import java.util.ArrayList;

public class ProdutoController {
    private ArrayList<Produto> produtos;

    public ProdutoController() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco) {
        Produto p = new Produto(nome, preco);
        produtos.add(p);
    }

    public ArrayList<Produto> listarProdutos() {
        return produtos;
    }
}
