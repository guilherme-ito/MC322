package diversos;

import item.CD;
import item.DVD;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map ;


public class Multimidia {

	public class Audio{
		private CD detalhes;
		private Set <String> podcasts;
		private Map <String,String> gravacaoPalestra;
	}
	public class Video{
		
	}
	public class Software{
		
	}
	
	enum FormatoMultimidia{
		AUDIO,VIDEO,SOFTWARE
	}
}
