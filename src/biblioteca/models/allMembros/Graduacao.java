package biblioteca.models.allMembros;

public class Graduacao extends Membro {
	
//	fields
	 private String curso;
	 private static int prazo;
	 
//	  constructor
	  public Graduacao(String nome, String registro, String endereco,String contato,String dataRegistro,
			  String curso) {

		    super(nome, registro,endereco,contato,dataRegistro);
		  	this.tipo=TipoMembro.GRAD;
	  		this.curso = curso;
	  		prazo=2;
	  		
	    	}
	  
//	  methods
	  public String toString() {
			return "nome"+this.getNome()+"registro"+this.getRegistro()+"endereco"+this.getEndereco()+"contato"+this.getContato()+
					"dataRegistro"+this.getDataRegistro()+"curso"+this.curso;
	    }
	  
	  
//	  getters
	  public String getCurso() {
	        return curso;
	    }
//	  setters
	  public void setCurso(String curso) {
	        this.curso = curso;
	    }
	  
}




