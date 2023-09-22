package biblioteca.models.item;

import biblioteca.models.generics.ItemBiblioteca;

public class Livro extends ItemBiblioteca<Livro> {
    
    private String autor;
    private String editora;
    private int edicao;
    private String isbn;

    public Livro(String titulo, int id, Status status, String autor, String editora, int edicao, String isbn) {
        super(titulo, id, status);
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.isbn = isbn;
    }

    public void emprestar (String titulo,int id, Status status) {
        ItemBiblioteca<Livro> emprestado = new ItemBiblioteca<> (this, titulo, id, status)
        emprestado.emprestar();
    }
    
    public void devolver (String titulo,int id, Status status) {
        ItemBiblioteca<Livro> devolvido = new ItemBiblioteca<> (this, titulo, id, status);
        devolvido.devolver();
    }

    public void reservar (String titulo,int id, Status status) {
        ItemBiblioteca<Livro> reservado = new ItemBiblioteca<> (this, titulo, id, status)
        reservar.reservar();
    }
}