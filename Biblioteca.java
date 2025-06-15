import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            /* for each, cada elemento de livros é um objeto da classe Livro. */
            for (Livro livro : livros) {
                // Aqui, ele chama o @Override que comentamos na classe Livro, trazendo todos os atributos de forma organizada.
                System.out.println(livro); 
            }
        }
    }
}
