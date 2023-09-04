package membros;

public class Professor extends Membro {
	
//	fields
	private String departamento;
	
//  constructor
    public Professor(String nome, String registro,String endereco,String contato,String dataRegistro,TipoMembro tipo,
    		String departamento) {
    	
    	super(nome, registro,endereco,contato,dataRegistro);
        this.tipo=TipoMembro.PROF;
        this.departamento = departamento;
    }
//    methods
    
    
//  getters
    public String getDepartamento() {
        return departamento;
    }

//  setters
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    

    
}
