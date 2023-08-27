package item;

import emprestimo.Emprestimo;

public abstract class Item {
	
//	fields
	private String titulo;
	private String localizacao;
	private String idioma;
	private String genero;
	private int lancamento;//ano de lançamento
	private boolean disponivel;
	Emprestimo emprestado;
//	lista de espera pro item
	
//	constructor
	public Item(String titulo,String idioma,String genero,int lancamento,boolean disponivel) {
		this.titulo=titulo;
		this.idioma=idioma;
		this.genero=genero;
		this.lancamento=lancamento;
		this.disponivel=disponivel;
	}
	
//	methods

//	getters
	 public String getTitulo() {
	        return titulo;
	    }

	    public String getLocalizacao() {
	        return localizacao;
	    }

	    public String getIdioma() {
	        return idioma;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public int getLancamento() {
	        return lancamento;
	    }

	    public boolean isDisponivel() {
	        return disponivel;
	    }

//	setters
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public void setLocalizacao(String localizacao) {
	        this.localizacao = localizacao;
	    }

	    public void setIdioma(String idioma) {
	        this.idioma = idioma;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public void setLancamento(int lancamento) {
	        this.lancamento = lancamento;
	    }

	    public void setDisponivel(boolean disponivel) {
	        this.disponivel = disponivel;
	    }

	
}
