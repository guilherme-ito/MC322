package membros;

public class Funcionario extends Membro {

//  fields
    private String cargo;

//  Class constructor
    public Funcionario(String nome,String registro, String cargo) {
        super(nome, registro);
        this.cargo = cargo;// Administradores, Atendentes e Gerentes.
        setPrazo(5);//  certo?
        setLimiteItens(3);
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
