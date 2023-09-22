package biblioteca.models.allMembros;

public class PosGraduacao extends Membro {
//	 fields
	 private String programa;
	 private static int prazo;
	    
	    public PosGraduacao(String nome, String registro,String endereco,String contato,String dataRegistro,
	    		String programa) {
	    	
	        super(nome, registro,endereco,contato,dataRegistro);
	        this.tipo=TipoMembro.POSGRAD;
	        this.programa = programa;
	        prazo=2;
	    }
//	    methods
	    public String toString() {
			return "nome"+this.getNome()+"registro"+this.getRegistro()+"endereco"+this.getEndereco()+"contato"+this.getContato()+
					"dataRegistro"+this.getDataRegistro()+"programa"+this.getPrograma();	
	    }
//	    getters
	    public String getPrograma() {
	        return programa;
	    }
//	    setters
	    public void setPrograma(String programa) {
	        this.programa = programa;
	    }
}
