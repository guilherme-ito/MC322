package item;



public class LivroFisico extends Item {

    //fields
	private String autor;
    private int edicao;
    int paginas;
    int exemplares;

    //constructor
    public LivroFisico(String autor,String titulo,String idioma,String genero,int lancamento,boolean disponivel, String classificacao,int edicao,int paginas,int exemplares) {
		super(titulo,idioma,genero,lancamento,disponivel);
		this.autor=autor;
		this.edicao=edicao;
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
    

    
    

} 