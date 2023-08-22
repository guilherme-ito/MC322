package Main;
import emprestimo.Emprestimo;
import item.Livro_fisico;
import pessoas.Funcionario;
import pessoas.Usuario;

public class Main {
    public static void main(String[] args) {
    	
    //Instanciação de objetos
    	
    Livro_fisico livro = new Livro_fisico ("Machado de Assis","Dom Casmurro",1,1899,new Emprestimo("12/10/2022","19/10/2022",true),"Romance");
    Funcionario funcionario = new Funcionario("João Da Silva","Bibliotecário");
    Usuario usuario = new Usuario ("Pedro Barbosa",58267,"253.567.452-0");
    
    usuario.reciboUsuario();
    funcionario.identificaçãoFuncionario();
    
        }
    }
