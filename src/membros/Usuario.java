package pessoas;
import item.Livro_fisico;

public class Usuario {

    //Atributos da classe
    private String nome;
    private int registro;
    private String CPF;
    private Livro_fisico livro;

    //Construtor da classe
    public Usuario (String nome,int registro, String CPF) {
        this.nome = nome;
        this.registro = registro;
        this.CPF = CPF;
    }
    //métodos
    
    public void reciboUsuario() {
    	System.out.println("Você acaba de adquirir o livro"+ this.livro.getTitulo()+
    			", por favor devolva até o dia "+ this.livro.getEmprestimo().getData_devolucao()+",bom proveito!");
    	}
    
    //Getters da classe
    
    public String getNome() {
    	return nome;
    }
    
    public int getRegistro () {
    	return registro;
    }
    
    public String getCPF () {
    	return CPF;
    }
    
    public Livro_fisico getLivro() {
    	return livro;
    }	
    //Setters da classe
    	
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public void setRegistro(int registro) {
    	this.registro = registro;
    }
    
    public void setCPF(String CPF) {
    	this.CPF = CPF;
    }
    
    public void setLivro (Livro_fisico livro) {
    	this.livro = livro;
    }
}
