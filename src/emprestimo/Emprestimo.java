package emprestimo;

    //Atributos da classe
public class Emprestimo {
    private String data_emprestimo;
    private String data_devolucao;
    private boolean emprestado;
    private int limite_de_livros;

    //Contrutor da classe
    public Emprestimo (String data_emprestimo,String data_devolucao,boolean emprestado) {
        this.data_devolucao = data_devolucao;
        this.data_emprestimo = data_emprestimo;
        this.emprestado = false;
    }
    
    //Getters da classe
	public String getData_devolucao() {
		return data_devolucao;
	}
	
	public String getData_emprestimo () {
		return data_emprestimo;
	}
	
	public boolean getEmprestado () {
		return emprestado;
	}
	
	public int getLimite_de_livros () {
		return limite_de_livros;
	}
	
	//Setters da classe
	
	public void setData_devolucao(String data_devolucao) {
		this.data_devolucao = data_devolucao;
	}
	
	public void setData_emprestimo(String data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}
	
	public void setEmprestado (boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	public void setLimite_de_livros (int limite_de_livros) {
		this.limite_de_livros = limite_de_livros;
	}
	
}