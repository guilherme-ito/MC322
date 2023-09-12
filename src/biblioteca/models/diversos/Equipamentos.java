package biblioteca.models.diversos;


import java.util.HashMap;
import java.util.Map ;

public class Equipamentos {

	public class Informatica{
		Map<String,String> informatica;
	}
	public class AudioVisual{
		Map<String,String> audioVisual;
	}
	public class Impressão{
		Map<String,String> impressao;
		
	}
	enum CategoriaEquipamento{
		INFORMATICA,AUDIOVISUAL,IMPRESSAO
	}
}
