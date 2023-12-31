package biblioteca.models.diversos;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import biblioteca.models.allMembros.Membro;

public class EventosBiblioteca {
	
//	fields
	private List<Membro> participantes;

	public class Palestra{
		private String palestrante;
		private String topico;
		private String data;
		private String horario;
		private String local;
		
	}
	public class Workshop{
		private String instrutor;
		private String topico;
		private String materiaisNeccessarios;
		private String data;
		private String horario;
		private String local;
	}
	public class Exposicao{
		private String tema;
		private Set <String> expositores;
		private String duracao;;
		private String local;
		
		
		
	}
	enum TipoDeEVento{
		PALESTRA,WORKSHOP,EXPOSICAO
	}
	
}
