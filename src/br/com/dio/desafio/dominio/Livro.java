// Classe concreta para livros
public class Livro extends Item implements ItemBiblioteca {
    private String autor;
    private int anoPublicacao;

    // Construtor
    public Livro(String id, String titulo, String autor, int anoPublicacao) {
        super(id, titulo);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Polimorfismo: Implementação específica de emprestar
    @Override
    public void emprestar() {
        if (!isEmprestado()) {
            setEmprestado(true);
            System.out.println("Livro '" + getTitulo() + "' foi emprestado com sucesso.");
        } else {
            System.out.println("Erro: Livro '" + getTitulo() + "' já está emprestado.");
        }
    }

    // Polimorfismo: Implementação específica de devolver
    @Override
    public void devolver() {
        if (isEmprestado()) {
            setEmprestado(false);
            System.out.println("Livro '" + getTitulo() + "' foi devolvido com sucesso.");
        } else {
            System.out.println("Erro: Livro '" + getTitulo() + "' não está emprestado.");
        }
    }

    // Polimorfismo: Detalhes específicos do livro
    @Override
    public String getDetalhes() {
        return "Livro: " + getTitulo() + ", Autor: " + autor + ", Ano: " + anoPublicacao +
               ", Status: " + (isEmprestado() ? "Emprestado" : "Disponível");
    }
}
