package pessoas;
import livro.Livro;

public class Usuario {

    //Atributos da classe
    private String nome;
    private int registro;
    private String CPF;
    private Livro livro;

    //Construtor da classe
    public Usuario (String nome,int registro, String CPF) {
        this.nome = nome;
        this.registro = registro;
        this.CPF = CPF;
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
    
    public Livro getLivro() {
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
    
    public void setLivro (Livro livro) {
    	this.livro = livro;
    }
}
