public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    /*
     * Redefine o toString caso tenha um System.out.println(livro), mostrando os
     * atributos de forma mais organizada.
     */
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Disponível: " + disponivel;
    }
}
