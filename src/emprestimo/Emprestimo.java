package emprestimo;
import item.Item;
//testando a branch 123456
    //Class fields
public class Emprestimo {
    private String data_emprestimo;
    private String data_devolucao;
    //total de livros emprestados

    //Class constructor
    public Emprestimo (String data_emprestimo,String data_devolucao) {
        this.data_devolucao = data_devolucao;
        this.data_emprestimo = data_emprestimo;
//        private static Item[] totalEmprestimo;lista de total de itens que estão emprestados pq n pode? array para toda classe global""
    }
    
    // Class Getters 
	public String getData_devolucao() {
		return data_devolucao;
	}
	
	public String getData_emprestimo () {
		return data_emprestimo;
	}
	
	
	
	
	//lass Setters 
	
	public void setData_devolucao(String data_devolucao) {
		this.data_devolucao = data_devolucao;
	}
	
	public void setData_emprestimo(String data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}
	
	

}