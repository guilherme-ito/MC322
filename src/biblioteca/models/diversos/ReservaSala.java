package biblioteca.models.diversos;

import java.util.HashMap;
import java.util.Map ;

public class ReservaSala extends ReservaBiblioteca{
//	fields
	private String num_sala;         //getters e setters?
	
//	inner classes
	public ReservaSala (String num_sala, String dataReserva, String horaFim, String horaInicio) {
		super(dataReserva,horaInicio,horaFim);
		this.num_sala = num_sala;	
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
	
	enum StatusReserva{
		PENDENTE,CONFIRMADA,CANCELADA
	}
	
	}
}
