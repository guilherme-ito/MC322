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
	    
	    
	    
	//  Getters 
	    public String getCargo () {
	    	return cargo;
	    }
	    
	//  Setters 
	    public void setCargo (String cargo) {
	    	this.cargo = cargo;
	    }
	}
