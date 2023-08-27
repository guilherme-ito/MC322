package membros;

public class Graduacao extends Membro {
//	fields
	 private String curso;
//	  constructor
	  public Graduacao(String nome, String registro, String curso) {
		  	super(nome, registro);
		  	setPrazo(5);
	  		this.curso = curso;
	  		setLimiteItens(3);
//	  		this.emprestados=new Item[5];
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





//	dúvida, como vamo fazer isso da lista de emprestados?