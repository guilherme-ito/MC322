package funcionario;

public abstract class Funcionario {

//  fields
    private String cargo;
    
//  Class constructor
    public Funcionario( String cargo) {
    	
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
