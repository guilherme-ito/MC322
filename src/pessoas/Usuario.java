package pessoas;

public class Usuario {

    //Atributos da classe
    private String nome;
    private int registro;
    private String CPF;
    private String livro_emprestado;

    //Construtor da classe
    public Usuario (String nome,int registro, String CPF, String livro_emprestado) {
        this.nome = nome;
        this.registro = registro;
        this.CPF = CPF;
        this.livro_emprestado = livro_emprestado;
    }
}
