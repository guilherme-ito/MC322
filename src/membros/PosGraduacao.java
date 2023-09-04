package membros;

public class PosGraduacao extends Membro {
//	 fields
	 private String programa;
	    
	    public PosGraduacao(String nome, String registro,String endereco,String contato,String dataRegistro,
	    		String programa) {
	    	
	        super(nome, registro,endereco,contato,dataRegistro);
	        
	        this.programa = programa;
	    }
//	    methods
	    
//	    getters
	    public String getPrograma() {
	        return programa;
	    }
//	    setters
	    public void setPrograma(String programa) {
	        this.programa = programa;
	    }
}
