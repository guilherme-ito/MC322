package item;

import emprestimo.Emprestimo;

public class Livro_fisico {

    //Class fields
    private String autor;
    private String titulo;
    private int edicao;
    private int ano;
    private Emprestimo emprestimo;
    private String genero;

    //Class Constructor
    public Livro_fisico (String autor, String titulo, int edicao, int ano,Emprestimo emprestimo,String genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.edicao = edicao;
        this.ano = ano;
        this.genero = genero;
    }
    //Class Getters
    public String getAutor () {
    	return autor;
    }
    
    public String getTitulo() {
    	return titulo;
    }
    
    public int getEdicao() {
    	return edicao;
    }
    
    public int getAno() {
    	return ano;
    }
    
    public Emprestimo getEmprestimo () {
    	return emprestimo;
    }
    
    public String getGenero () {
    	return genero;
    }
    
    //Class Setters
    public void setAutor(String autor) {
    	this.autor = autor;
    }
    
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    
    public void setEdicao(int edicao) {
    	this.edicao = edicao;
    }
    
    public void setAno (int ano) {
    	this.ano = ano;
    }
    
    public void setEmprestimo (Emprestimo emprestimo) {
    	this.emprestimo = emprestimo;
    }
    
    public void setGenero (String genero) {
    	this.genero = genero;
    }
}
