package biblioteca.models.allMembros;

public class Graduacao extends Membro {
	
//	fields
	 private String curso;
	 
//	  constructor
	  public Graduacao(String nome, String registro, String endereco,String contato,String dataRegistro,
			  String curso) {

		    super(nome, registro,endereco,contato,dataRegistro);
		  	this.tipo=TipoMembro.GRAD;
	  		this.curso = curso;
	  		
	    	}
	  
//	  methods
	  
	  
//	  getters
	  public String getCurso() {
	        return curso;
	    }
//	  setters
	  public void setCurso(String curso) {
	        this.curso = curso;
	    }
	  
}




