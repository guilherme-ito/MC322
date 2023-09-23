package biblioteca.models.generics;
import java.util.LinkedList;
import java.util.List;
import biblioteca.models.item.ItemMultimidia;

public class ListaEmprestimos<T extends ItemMultimidia> {
    // Atributos
    private List<T> listaEmprestimos;

    // Construtores
    public ListaEmprestimos() {
        listaEmprestimos = new LinkedList<>();
    }

    //Métodos
    public void adicionarItem(T ItemMultimidia) {
        listaEmprestimos.add(ItemMultimidia);
    }

    public void removerItem(T ItemMultimidia) {
        listaEmprestimos.remove(ItemMultimidia);
    }

    public void listarItensEmprestados (List<T> listaEmprestimos) {
    if (listaEmprestimos.isEmpty()) {
        System.out.println("Não há nenhuma empréstimo");
    }
    else {
        System.out.println("A lista de empréstimo é");
        for (T ItemMultimidia : listaEmprestimos) {
            System.out.println(ItemMultimidia.toString());
        }
    }
    }
}
