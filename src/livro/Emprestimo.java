package livro;

    //Atributos da classe
public class Emprestimo {
    String data_emprestimo;
    String data_devolucao;

    //Contrutor da classe
    public Emprestimo (String data_emprestimo,String data_devolucao) {
        this.data_devolucao = data_devolucao;
        this.data_emprestimo = data_emprestimo;
    }
}
