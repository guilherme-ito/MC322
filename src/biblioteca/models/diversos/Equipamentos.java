public class Equipamento extends ItemBiblioteca<Equipamento> {
    
	// Atributos
	private Tipo tipo;
    private String marca;
    private String modelo;

	// Construtores
    public Equipamento(String titulo, int id, Status status, Tipo tipo, String marca, String modelo) {
        super(titulo, id, status);
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }
	
    public void adicionarReserva  (Equipamento) {
        ListaReservas<Multimidia> reservado = new ListaReservas<>(dataReserva,horaFim,horaInicio)
        reservado.adicionarReserva;
	}
	 public void removerReserva (Equipamento) {
        ListaReservas<Multimidia> removido = new ListaReservas<>(dataReserva,horaFim,horaInicio)
        removido.removerReserva;
	 }
}