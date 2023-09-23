package biblioteca.models.diversos;

public class ReservaBiblioteca {
    private String dataReserva;
	private String horaInicio;
	private String horaFim;

public ReservaBiblioteca(String dataReserva, String horaFim, String horaInicio) {
    this.dataReserva = dataReserva;
    this.horaFim = horaFim;
    this.horaInicio = horaInicio;
    }
}

