package biblioteca.models.diversos;

import java.util.HashSet;
import java.util.Set;

import biblioteca.models.item.CD;
import biblioteca.models.item.DVD;

import java.util.HashMap;
import java.util.Map ;


public class Multimidia {

	public class Audio{
		private CD detalhesCD;
		private Map <String,String> podcasts;
		private Map <String,String> gravacaoPalestra;
	}
	public class Video{
		private DVD detalhesDVD;
		private Map <String,String> gravacaoaula;
		private Map <String,String> documentario;
	}
	public class Software{
		private Set <String> softwareEduc;
		private Set <String> softwareSimul;
		
	}
	
	enum FormatoMultimidia{
		AUDIO,VIDEO,SOFTWARE
	}
}
