import livro.Emprestimo;
import livro.Livro;
import pessoas.Funcionario;
import pessoas.Usuario;

public class Main {
    public static void main(String[] args) {
    Livro livro = new Livro ("Machado de Assis","Dom Casmurro",1,1899,new Emprestimo("12/10/2022","19/10/2022"));
    Funcionario funcionario = new Funcionario("João Da Silva","Bibliotecário");
    Usuario usuario = new Usuario ("Pedro Barbosa",58267,"253.567.452-0","Dom Casmurro");
        }
    }
