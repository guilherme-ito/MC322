import java.util.LinkedList;
import java.util.List;
import biblioteca.models.generics.ItemBiblioteca;

public class ListaEmprestimos<T> {

    // Atributos
    private List<T> listaItens;
    private String dataEmprestimo;
    private String dataDevolucao;
    
    // Construtores
    public ListaEmprestimos(String dataEmprestimo, String dataDevolucao) {
        listaItens = new LinkedList<>();
        this.dataEmprestimo = dataEmprestimo
        this.dataDevolucao = dataDevolucao;
    }

    //Métodos
    public void adicionarItem() {
        listaItens.add(T ItemBiblioteca)
    }

    public void removerItem() {
        listaItens.remove(T ItemBiblioteca)
    }

    public List<T> listarItensEmprestados() {
        if listaItens = null {
            System.out.println ("Não há itens emprestados")
            return 0;
        }
        else {
            return listaItens;
        }
    }
}
