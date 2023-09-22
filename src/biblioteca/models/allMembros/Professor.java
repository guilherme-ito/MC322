package biblioteca.models.allMembros;

public class Professor extends Membro {
	
//	fields
	private String departamento;
	private static int prazo;
	
//  constructor
    public Professor(String nome, String registro,String endereco,String contato,String dataRegistro,
    		String departamento) {
    	
    	super(nome, registro,endereco,contato,dataRegistro);
        this.tipo=TipoMembro.PROF;
        this.departamento = departamento;
        prazo=2;
        
    }
//    methods
    public String toString() {
		return "nome"+this.getNome()+"registro"+this.getRegistro()+"endereco"+this.getEndereco()+"contato"+this.getContato()+
				"dataRegistro"+this.getDataRegistro()+"departamento"+this.departamento;
    }
    
    
    
//  getters
    public String getDepartamento() {
        return departamento;
    }

//  setters
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    

    
}
