package biblioteca.models.membros.funcionarios;

import biblioteca.models.membros.Membro;
import biblioteca.models.membros.TipoMembro;

public class Funcionario extends Membro {
	
	//  fields
	    private String cargo;
	    
	//  Class constructor
	    public Funcionario(String nome, String registro,String endereco,String contato,String dataRegistro,TipoMembro tipo,
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
