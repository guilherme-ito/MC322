package biblioteca.models.generics;
import java.util.ArrayList;
import java.util.List;
import biblioteca.models.item.ItemMultimidia;
import java.util.LinkedList;

public class ItemBiblioteca<T extends ItemMultimidia> {
    
    //Atributos
    private List<T> itensReservados;
    private List<T> itensEmprestados;
    private int numeroDeItensEmprestados;
    private int numeroDeItensReservados;

    // Construtores
    public ItemBiblioteca() {
        this.itensReservados = new ArrayList<>();
        this.itensEmprestados = new LinkedList<>();
        this.numeroDeItensEmprestados = 0;
        this.numeroDeItensReservados = 0;
    }

    // Methods
    public void reservar (T ItemMultimidia) {
        itensReservados.add(ItemMultimidia);
        numeroDeItensReservados ++;
    }

    public void emprestar (T ItemMultimidia) {
        itensEmprestados.add(ItemMultimidia);
        numeroDeItensEmprestados ++;
        
        if (itensReservados.contains(ItemMultimidia)) {
            itensReservados.remove(ItemMultimidia);
            numeroDeItensReservados --;
        }
            
    }

    public void devolverItem(T ItemMultimidia) {
        if (itensEmprestados.contains(ItemMultimidia)) {
            itensEmprestados.remove(ItemMultimidia);
            numeroDeItensEmprestados--;

        } else {
            System.out.println("O item não está emprestado, portanto não pode ser devolvido.");
        }
    }

}
