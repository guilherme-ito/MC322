package item;

public class LivroFisico extends Item {

    //fields
	private String autor;
	private String editora;
    private int edicao;
    private int paginas;
    private int exemplares;
    
    

    //constructor
    public LivroFisico(String autor,String titulo,String idioma,String genero,int lancamento,boolean disponivel,String sinopse,String capa, String classificacao,String editora,int edicao,int paginas,int exemplares,int exemplaresDisp) {
		super(titulo,idioma,genero,lancamento,disponivel,sinopse,capa,classificacao);
		this.autor=autor;
		this.edicao=edicao;
		this.editora=editora;
		this.paginas=paginas;
		this.exemplares=exemplares;
		
	}


//    methods
    
    
//  getters
    public String getAutor() {
        return autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public int getPaginas() {
        return paginas;
    }
    public int getExemplares() {
        return exemplares;
    }
    public String getEditora() {
        return editora;
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

    

} 