import java.util.ArrayList;
import java.util.List;

// Classe para gerenciar a biblioteca
public class Biblioteca {
    private List<ItemBiblioteca> itens;
    private List<Usuario> usuarios;

    // Construtor
    public Biblioteca() {
        this.itens = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    // Adicionar item à biblioteca
    public void adicionarItem(ItemBiblioteca item) {
        itens.add(item);
        System.out.println("Item '" + item.getDetalhes() + "' adicionado à biblioteca.");
    }

    // Adicionar usuário à biblioteca
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário '" + usuario.getNome() + "' adicionado à biblioteca.");
    }

    // Realizar empréstimo
    public void realizarEmprestimo(String idItem, String idUsuario) {
        ItemBiblioteca item = buscarItem(idItem);
        Usuario usuario = buscarUsuario(idUsuario);

        if (item != null && usuario != null) {
            item.emprestar();
        } else {
            System.out.println("Erro: Item ou usuário não encontrado.");
        }
    }

    // Realizar devolução
    public void realizarDevolucao(String idItem) {
        ItemBiblioteca item = buscarItem(idItem);
        if (item != null) {
            item.devolver();
        } else {
            System.out.println("Erro: Item não encontrado.");
        }
    }

    // Buscar item por ID
    private ItemBiblioteca buscarItem(String id) {
        for (ItemBiblioteca item : itens) {
            if (item instanceof Item && ((Item) item).getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    // Buscar usuário por ID
    private Usuario buscarUsuario(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    // Exibir todos os itens
    public void exibirItens() {
        System.out.println("\nItens na biblioteca:");
        for (ItemBiblioteca item : itens) {
            System.out.println(item.getDetalhes());
        }
    }
}
