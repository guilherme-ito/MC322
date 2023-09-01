package funcionario;

public abstract class Funcionario {

//  fields
    private String cargo;
    private String nome;
    private String registro;

//  Class constructor
    public Funcionario(String nome,String registro, String cargo) {
    	this.nome = nome;
    	this.registro = registro;
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
