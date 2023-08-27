package emprestimo;
//import java.time.LocalDate;

    //Class fields
public class Emprestimo {
    private String data_emprestimo;
    private String data_devolucao;
    private boolean emprestado;
    private int limite_de_livros;

    //Class constructor
    public Emprestimo (String data_emprestimo,String data_devolucao,boolean emprestado) {
        this.data_devolucao = data_devolucao;
        this.data_emprestimo = data_emprestimo;
        this.emprestado = false;
    }
    
    // Class Getters 
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
	
	//Class Setters 
	
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