package biblioteca.models.emprestimo;
import biblioteca.models.allMembros.Membro;
import biblioteca.models.allMembros.funcionarios.Funcionario;
import biblioteca.models.item.Item;

    
public class Emprestimo {
	
	//Class fields
	private Membro usuario;
	private Item recurso;
	private Funcionario emprestador;
    private String dataEmprestimo;
    private String dataDevolucao;
   
   
    
    
  

    //Class constructor
    public Emprestimo (Membro usuario,Item recurso,Funcionario  emprestador,String dataEmprestimo,String dataDevolucao) {
    	this.usuario=usuario;
    	this.recurso=recurso;
    	this.emprestador=emprestador;
    	this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
//        
    }
    
    // Class Getters .
    public Membro getUsuario() {
        return usuario;
    }

    public Item getRecurso() {
        return recurso;
    }

    public Funcionario getEmprestador() {
        return emprestador;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    



	
	
	//lass Setters 
	
    public void setUsuario(Membro usuario) {
        this.usuario = usuario;
    }

    public void setRecurso(Item recurso) {
        this.recurso = recurso;
    }

    public void setEmprestador(Funcionario emprestador) {
        this.emprestador = emprestador;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    

	

}