package biblioteca.models.item;

import biblioteca.models.emprestimo.Emprestimo;

public abstract class Item {
	
//	fields
	private String titulo;
	private String idioma;
	private String genero;
	private int lancamento;//ano de lançamento
	private boolean disponivel;
	Emprestimo emprestado;
	private String sinopse;
	private String capa;
	private String classificacao;
	private int id;
	
//	lista de espera pro item
	
//	constructor
	public Item(String titulo,String idioma,String genero,int lancamento,boolean disponivel,
			String sinopse,String capa, String classificacao, int id) {
		this.titulo=titulo;
		this.idioma=idioma;
		this.genero=genero;
		this.lancamento=lancamento;
		this.disponivel=disponivel;
		this.sinopse=sinopse;
		this.capa=capa;
		this.classificacao=classificacao;
		this.id=id;
	}
	
//	methods

//	getters
	 public String getTitulo() {
	        return titulo;
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
	    
	    public String getSinopse() {
	        return sinopse;
	    }

	    public String getCapa() {
	        return capa;
	    }
	    public String getClassificacao() {
	        return classificacao;
	    }
	    public int getId() {
	        return id;
	    }
	    

//	setters
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
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

	    public void setSinopse(String sinopse) {
	        this.sinopse = sinopse;
	    }

	    public void setCapa(String capa) {
	        this.capa = capa;
	    }
	    
	    public void setClassificacao(String classificacao) {
	        this.classificacao = classificacao;
	    }
	    public void setId(int novoId) {
	        id = novoId;
	    }
	
}
