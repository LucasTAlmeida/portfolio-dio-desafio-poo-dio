// Classe principal para testar o sistema
public class Main {
    public static void main(String[] args) {
        // Criar biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criar e adicionar livros
        Livro livro1 = new Livro("001", "O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("002", "1984", "George Orwell", 1949);
        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);

        // Criar e adicionar usuários
        Usuario usuario1 = new Usuario("U001", "Ana Silva");
        Usuario usuario2 = new Usuario("U002", "João Santos");
        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        // Exibir itens
        biblioteca.exibirItens();

        // Realizar empréstimos
        biblioteca.realizarEmprestimo("001", "U001");
        biblioteca.realizarEmprestimo("001", "U002"); // Deve falhar (já emprestado)

        // Exibir itens após empréstimo
        biblioteca.exibirItens();

        // Realizar devolução
        biblioteca.realizarDevolucao("001");

        // Exibir itens após devolução
        biblioteca.exibirItens();
    }
}
