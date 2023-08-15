package pessoas;

public class Funcionario {

    // Atributos da classe
    private String nome;
    private String cargo;

    //Construtor da classe
    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
    
    //Getters da classe
    
    public String getNome () {
    	return nome;
    }
    
    public String getCargo () {
    	return cargo;
    }
    
    //Setters da classe
    
    public void setNome (String nome) {
    	this.nome = nome;
    }
    
    public void setCargo (String cargo) {
    	this.cargo = cargo;
    }
}
