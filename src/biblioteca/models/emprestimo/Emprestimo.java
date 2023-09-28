package biblioteca.models.emprestimo;

    
public class Emprestimo {
	
	//Class fields
    private String dataEmprestimo;
    private String dataDevolucao;
   
    private int limite;//q isso qr dizeer?
    private int prazo;//acho q isso é melhor colocar em membros
    private int multa;//acho q isso é melhor colocar em membros
    
  

    //Class constructor
    public Emprestimo (String dataEmprestimo,String dataDevolucao,int limite,int prazo,int multa) {
    	
    	this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
//        
    }
    
    // Class Getters .
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	
	public String getDataEmprestimo () {
		return dataEmprestimo;
	}
	public int getLimite() {
        return limite;
    }

    public int getPrazo() {
        return prazo;
    }

    public int getMulta() {
        return multa;
    }
	
	
	//lass Setters 
	
	public void setData_devolucao(String data_devolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public void setData_emprestimo(String data_emprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
    
	public void setLimite(int limite) {
        this.limite = limite;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }	

}