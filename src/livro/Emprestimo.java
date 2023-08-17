package livro;
//teste teste2 10;05
    //Atributos da classe
public class Emprestimo {
    String data_emprestimo;
    String data_devolucao;
    boolean emprestado;

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
	
	
}