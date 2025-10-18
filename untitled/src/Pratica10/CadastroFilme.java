import java.util.ArrayList;
import java.util.List;

public class CadastroFilme {
    private List<Filme> filmes = new ArrayList<>();

    public void adicionarFilme(Filme f) {
        filmes.add(f);
    }

    public void imprimirTodos() {
        System.out.println("\nFilmes cadastrados:");
        for (Filme f : filmes) {
            f.imprimir();
        }
    }
}
