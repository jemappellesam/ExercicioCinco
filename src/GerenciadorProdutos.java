import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    private List<Produto> listaProdutos;

    public GerenciadorProdutos() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void removerProduto(int id) {
        Produto produtoRemover = null;

        for (Produto produto : listaProdutos) {
            if (produto.getId() == id) {
                produtoRemover = produto;
                break;
            }
        }

        if (produtoRemover != null) {
            listaProdutos.remove(produtoRemover);
        }
        else {
        System.out.println("Id incorreto; Tente novamente.");
        }
    }

    public void listarProdutos() {
        for (Produto produto : listaProdutos) {
            System.out.println(produto.toString());
        }
    }
    public int consultarID(Produto produto){
        return produto.getId();
    }


}
