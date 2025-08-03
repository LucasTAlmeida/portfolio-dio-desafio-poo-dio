// Interface para abstração de itens que podem ser emprestados
public interface ItemBiblioteca {
    void emprestar();
    void devolver();
    String getDetalhes();
}
