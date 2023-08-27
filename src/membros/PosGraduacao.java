package membros;

public class PosGraduacao extends Membro {
//	 fields
	 private String programa;
	    
	    public PosGraduacao(String nome, String registro, String programa) {
	        super(nome, registro);
	        setPrazo(5);//ou super.setPrazo?
	        setLimiteItens(3);
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
