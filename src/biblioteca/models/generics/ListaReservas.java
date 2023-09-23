package biblioteca.models.generics;
import java.util.ArrayList;
import java.util.List;
import biblioteca.models.diversos.ReservaBiblioteca;

public class ListaReservas<T extends ReservaBiblioteca> {
    private List<T> listaReservas;

    public ListaReservas() {
        this.listaReservas = new ArrayList<>();
    }

    // Métodos
    public void adicionarReserva (T ReservaBiblioteca) {
            listaReservas.add(ReservaBiblioteca);
    }

        public void removerItem(T ReservaBiblioteca) {
            listaReservas.remove(ReservaBiblioteca);
    }

    public void listarItensReservados (List<T> listaEmprestimos) {
    if (listaEmprestimos.isEmpty()) {
        System.out.println("Não há nenhuma reserva feita");
    }
    else {
        for (T Reserva : listaReservas) {
            System.out.println("A lista de reserva é");
            System.out.println(Reserva.toString());
        }
    }
}
}
    

