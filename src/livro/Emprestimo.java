package livro;

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
	public String get_Data_devolucao() {
		return data_devolucao;
	}
	
	public String get_Data_emprestimo() {
		return data_emprestimo;
	}
}