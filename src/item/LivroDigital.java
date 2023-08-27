package item;

public class LivroDigital extends Item {//talvez seja bom criar um pai dos dois livros

//	fields
	private String autor;
    private int edicao;
    int paginas;
    int tamanhoArquivo;
    
  //constructor
    public LivroDigital(String autor,String titulo,String idioma,String genero,int lancamento,boolean disponivel, String classificacao,int edicao,int paginas,int tamanhoArquivo) {
		super(titulo,idioma,genero,lancamento,disponivel);
		this.autor=autor;
		this.edicao=edicao;
		this.paginas=paginas;
		this.tamanhoArquivo=tamanhoArquivo;
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
    public int getTamanhoArquivo() {
        return tamanhoArquivo;
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
    public void setTamanhoArquivo(int tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
    
    
    
}
