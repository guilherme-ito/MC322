package biblioteca.models.item;

public class LivroFisico extends Item {

    //fields
	private String autor;
	private String editora;
    private int edicao;
    private int paginas;
    private int exemplares;// tem que ser exemplares da edição
    // tem que ter os exemplares disponíveis tmb
    private String isbn;
    private String conservacao;
    private String localizacao;
    

    //constructor
    public LivroFisico(String titulo,String idioma,String genero,int lancamento,boolean disponivel,
    		String sinopse,String capa,String classificacao,int id,
    		String autor,String editora,int edicao,int paginas,int exemplares, String isbn, String conservacao, String localizacao) {
    	
		super(titulo,idioma,genero,lancamento,disponivel,sinopse,capa,classificacao,id);
		this.autor=autor;
		this.edicao=edicao;
		this.editora=editora;
		this.paginas=paginas;
		this.exemplares=exemplares;
		this.isbn=isbn;
		this.conservacao=conservacao;
		this.localizacao=localizacao;
		
	}


//    methods
    
    
//  getters
    public String getAutor() {
        return autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getEditora() {
    	return editora;
    }
    public int getPaginas() {
        return paginas;
    }
    public int getExemplares() {
    	return exemplares;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getConservacao() {
        return conservacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    
    

//  setters
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }
    
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    

} 