package biblioteca.models.generics;
import java.util.ArrayList;
import java.util.List;
import biblioteca.models.item.ItemMultimidia;
import java.util.LinkedList;
import biblioteca.models.allMembros.*;
import biblioteca.models.exceptions.LimiteEmprestimoExcedidoException;
import biblioteca.models.exceptions.DevolucaoFalhaException;

public class ItemBiblioteca<T extends ItemMultimidia> {
    
    //Atributos
    private List<T> itensReservados;
    private List<T> itensEmprestados;
    private int numeroDeItensEmprestados;
    private int numeroDeItensReservados;
    private Membro membro;

    // Construtores
    public ItemBiblioteca() {
        this.itensReservados = new ArrayList<>();
        this.itensEmprestados = new LinkedList<>();
        this.numeroDeItensEmprestados = 0;
        this.numeroDeItensReservados = 0;
        this.membro = null;
    }

    // Methods
    public void reservar (T ItemMultimidia) {
        itensReservados.add(ItemMultimidia);
        numeroDeItensReservados ++;
    }

    public void emprestar (T ItemMultimidia, Membro membro) {
        try {
            if ((membro.getQuantidadeItensEmprestados() >= membro.getLimiteQuantidadeEmprestimos()) || membro == null) {
                throw new LimiteEmprestimoExcedidoException("Limite de empréstimo excedido");
            }    
            itensEmprestados.add(ItemMultimidia);
            numeroDeItensEmprestados ++;
            this.membro = membro;

            if (itensReservados.contains(ItemMultimidia)) {
                itensReservados.remove(ItemMultimidia);
                numeroDeItensReservados --;
            }
        } catch(LimiteEmprestimoExcedidoException e) {
            System.err.println("Erro ao tentar emprestar o livro" + e.getMessage());
        }   
    }

    public void devolverItem(T ItemMultimidia, Membro membro) {
        try {
            if (!membro.getListaEmprestados().contains(ItemMultimidia)) {
                throw new DevolucaoFalhaException("O item não está emprestado para ser devolvido");
            }    
            //if (ItemMultimidia.getEstado() = "PÉSSIMO") {
                //throw new DevolucaoFalhaException("O item está muito danificado e precisa ser levado à manutenção");
            //}
        } catch (DevolucaoFalhaException e) {
            System.err.println("Erro ao devolver o livro" +e.getMessage());
        }    
            
        if (itensEmprestados.contains(ItemMultimidia)) {
                itensEmprestados.remove(ItemMultimidia);
                numeroDeItensEmprestados--;
        } 

}
}
