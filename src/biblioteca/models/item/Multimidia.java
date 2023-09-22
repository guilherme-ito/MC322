import biblioteca.models.generics.ItemBiblioteca;

public class Multimidia extends ItemBiblioteca<Multimidia> {

    private Formato formato;
    private int duracao; 

    public Multimidia(String titulo, int id, Status status, Formato formato, int duracao) {
        super(titulo, id, status);
        this.formato = formato;
        this.duracao = duracao;
    }

    public void adicionarItem (T ItemBiblioteca) {
        ListaEmprestimos<Multimidia> adicionado = new ListaEmprestimos<>(dataDevolucao,dataEmprestimo)
        adicionado.adicionarItem;
    }

    public void removerItem (T ItemBiblioteca) {
        ListaEmprestimos<Multimidia> removido = new ListaEmprestimos<>(dataDevolucao,dataEmprestimo)
        removido.removerItem;
    }
}   