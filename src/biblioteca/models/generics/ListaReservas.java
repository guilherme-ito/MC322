import java.util.ArrayList;
import java.util.List;
import biblioteca.models.generics.ReservaBiblioteca;

public class ListaReservas<T> {
    
    // Atributos
    private List<T> listaReservas;
    private String dataReserva;
    private String horaInicio;
    private String horaFim;

    // Construtores
    public ListaReservas (String dataReserva, String horaInicio, String horaFim) {
        listaReservas = new ArrayList<>();
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    // Métodos

    public void adicionarReserva () {
        listaReservas.add(T ReservaBiblioteca)    
    }

    public void removerReserva () {
        listaReservas.remove(T ReservaBiblioteca)
    }

    public List<T> listarReservas () {
        if listaReservas = null {
            System.out.println ("Não há nenhuma reserva")
            return 0;
        }
        else {
            return listaReservas;
        }
    }
}
    

