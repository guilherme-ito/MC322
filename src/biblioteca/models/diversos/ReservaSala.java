package biblioteca.models.diversos;

import java.util.HashMap;
import java.util.Map ;
 
import biblioteca.models.exceptions.ReservandoSala;

public class ReservaSala extends ReservaBiblioteca{
//	fields
	private String numSala;         //getters e setters?
	private StatusReserva reserva;
	private StatusSala status;
	private int usuariosPresentes;
	private int capcMax;
//	inner classes
	public ReservaSala (String numSala, String dataReserva, String horaFim, String horaInicio) {
		super(dataReserva,horaInicio,horaFim);
		this.numSala = numSala;	
	}
	
	public class SalaIndividual{
		//fields
		private boolean compDisp;
		private int salaNum;
	}
	public class SalaGrupo{
		//fields
		private int capcMAx;
		private boolean projetor;
	}
	public class SalaSilenciosa{
		//fields
		private int numAssentos;
		private boolean cabineIndiv;
	}
	public class SalaMultimidia{
		Map<String,Integer> equipDisp;
		
		 public SalaMultimidia() {
		        equipDisp = new HashMap<>();
		        equipDisp.put("computador", 5);
		        equipDisp.put("teclado", 7);
		        equipDisp.put("fone", 6); 
	}
//		 methods
	
	}
	public boolean ReservarSala() {
		try {
			if (this.usuariosPresentes==capcMax) {
				throw new ReservandoSala(numSala,2);
			}
			if(this.status==StatusSala.OCUPADA) {
				throw new ReservandoSala(numSala,1);
			}
				
		} catch (ReservandoSala a) {
			System.out.println("Ocorreu um erro");
			a.printStackTrace();
			a.getMessage();
			
		}
		
		return false;
	}
	
	enum StatusReserva {
		PENDENTE,CONFIRMADA,CANCELADA
	}
	enum StatusSala {
		OCUPADA,LIVRE
	}
}
