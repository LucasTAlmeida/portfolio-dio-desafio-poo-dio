// Classe abstrata para itens da biblioteca
public abstract class Item {
    private String id; // Identificador único
    private String titulo; // Título do item
    private boolean emprestado; // Estado do empréstimo

    // Construtor
    public Item(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.emprestado = false;
    }

    // Encapsulamento: Getters e Setters
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    protected void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}
