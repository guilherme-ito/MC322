package livro;
import livro.Emprestimo;

public class Livro {

    //Atributos da classe
    private String autor;
    private String titulo;
    private int edicao;
    private int ano;
    private Emprestimo emprestimo;

    //Construtor da classe
    public Livro (String autor, String titulo, int edicao, int ano,Emprestimo emprestimo) {
        this.autor = autor;
        this.titulo = titulo;
        this.edicao = edicao;
        this.ano = ano;
    }
}
