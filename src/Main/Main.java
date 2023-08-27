package Main;
import emprestimo.Emprestimo;
import item.LivroFisico;
import membros.Funcionario;
import membros.Graduacao;


public class Main {
    public static void main(String[] args) {
    	
//  object instantiation    	
    	
    LivroFisico livro = new LivroFisico ("Machado de Assis","Dom Casmurro",1,1899,new Emprestimo("12/10/2022","19/10/2022",true),"Romance");
    Funcionario funcionario = new Funcionario("João Da Silva","12345","Bibliotecário");
    Graduacao g1 = new Graduacao ("Thiago Nadim","239426","Ciência da computação");
    
    }
    
    
}
