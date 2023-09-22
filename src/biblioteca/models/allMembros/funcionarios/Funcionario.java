package biblioteca.models.allMembros.funcionarios;

import biblioteca.models.allMembros.Membro;
import biblioteca.models.allMembros.TipoMembro;

public class Funcionario extends Membro {
	
	//  fields
	    private String cargo;
	    
	//  Class constructor
	    public Funcionario(String nome, String registro,String endereco,String contato,String dataRegistro,
	    		String cargo) {
	    	
	        super(nome, registro,endereco,contato,dataRegistro);
	        this.tipo=TipoMembro.FUNC;
	        this.cargo = cargo;
	    }
	//  Methods
	    public String toString() {
			return "nome"+this.getNome()+"registro"+this.getRegistro()+"endereco"+this.getEndereco()+"contato"+this.getContato()+
					"dataRegistro"+this.getDataRegistro()+"departamento"+this.cargo;
	    }
	    
	    
	    
	//  Getters 
	    public String getCargo () {
	    	return cargo;
	    }
	    
	//  Setters 
	    public void setCargo (String cargo) {
	    	this.cargo = cargo;
	    }
	}
