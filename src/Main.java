public class Main {
    public static void main(String[] args) {
        GerenciadorProdutos gerenciador = new GerenciadorProdutos();

        Produto geladeira = new Produto("Geladeira", 900.50);
        Produto tv = new Produto("TV", 699.99);
        Produto smartphone = new Produto("Smartphone", 899.00);

        gerenciador.adicionarProduto(geladeira);
        gerenciador.adicionarProduto(tv);
        gerenciador.adicionarProduto(smartphone);
        gerenciador.listarProdutos();
        gerenciador.removerProduto(gerenciador.consultarID(tv));
        gerenciador.listarProdutos();
    }
}