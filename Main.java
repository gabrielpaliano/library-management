import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "\n1 - Adicionar Livro\n2 - Listrar Livros\n3 - Adicionar Usuário  \n4 - Listar Usuarios\n0 - Sair");
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            // scanner.nextLine limpa o buffer.
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Título: ");
                String titulo = scanner.nextLine();
                System.out.print("Autor: ");
                String autor = scanner.nextLine();
                System.out.print("ISBN: ");
                String isbn = scanner.nextLine();
                biblioteca.adicionarLivro(new Livro(titulo, autor, isbn));
            } else if (opcao == 2) {
                biblioteca.listarLivros();
            } else if (opcao == 3) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("CPF: ");
                String cpf = scanner.nextLine();
                System.out.print("Contato: ");
                String contato = scanner.nextLine();
                biblioteca.adicionarUsuario(new Usuario(nome, cpf, contato));
            } else if (opcao == 4) {
                biblioteca.listarUsuarios();
            } else if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}