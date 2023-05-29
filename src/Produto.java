import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Produto {
    private int id;
    private String nome;
    private double preco;

    private static Set<Integer> idsUtilizados = new HashSet<>();

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.id = gerarIdUnico();
    }

    private int gerarIdUnico() {
        Random gerador = new Random();
        int novoId;

        do {
            novoId = gerador.nextInt(Integer.MAX_VALUE);
        } while (idsUtilizados.contains(novoId));

        idsUtilizados.add(novoId);
        return novoId;
    }
    public int getId(){
        return this.id;
    }

    @Override
    public String toString() {
        return "Nome: "+this.nome + "\nPreço: "+this.preco +"\n Id: "+this.getId();
    }
}
