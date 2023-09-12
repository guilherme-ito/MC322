package biblioteca.models.emprestimo;
import biblioteca.models.item.Item;

    
public class Emprestimo {
	
	//Class fields
    private String dataEmprestimo;
    private String dataDevolucao;
   
    private int limite;
    private int prazo;
    private int multa;//falta completar aqui
    
    //total de livros emprestados

    //Class constructor
    public Emprestimo (String dataEmprestimo,String dataDevolucao,int limite,int prazo,int multa) {
    	
    	this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
//        
    }
    
    // Class Getters 
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	
	public String getDataEmprestimo () {
		return dataEmprestimo;
	}
	
	
	//lass Setters 
	
	public void setData_devolucao(String data_devolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public void setData_emprestimo(String data_emprestimo) {
		this.dataEmprestimo = dataEmprestimo;}
	
	

}