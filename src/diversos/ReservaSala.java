package diversos;

import java.util.HashMap;
import java.util.Map ;

public class ReservaSala {
//	fields
	
	private String dataReserva;
	private String horaInicio;
	private String horaFim;         //getters e setters?
	
//	inner classes
	
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
