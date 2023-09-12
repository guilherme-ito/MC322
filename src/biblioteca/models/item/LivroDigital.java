package biblioteca.models.item;

public class LivroDigital extends Item {//talvez seja bom criar um pai dos dois livros

//	fields
	private String autor;
    private int edicao;
    private int paginas;
    private int tamanhoArquivo;
    private String formato;
    private int numLicencas;
    private String urlAcesso;
    private String reqLeitura;
    //data de disponibilidade? q isso
    
    
  //constructor
    public LivroDigital(String titulo,String idioma,String genero,int lancamento,boolean disponivel, String sinopse,String capa, String classificacao,
    		String autor,int edicao,int paginas,int tamanhoArquivo,String formato,int numLicencas,String urlAcesso,
    		String reqLeitura) {
    	
		super(titulo,idioma,genero,lancamento,disponivel,sinopse,capa,classificacao);
		this.autor=autor;
		this.edicao=edicao;
		this.paginas=paginas;
		this.tamanhoArquivo=tamanhoArquivo;
		this.formato=formato;
		this.numLicencas=numLicencas;
		this.urlAcesso=urlAcesso;
		this.reqLeitura=reqLeitura;
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
    
    public String getFormato() {
        return formato;
    }

    public int getNumLicencas() {
        return numLicencas;
    }

    public String getUrlAcesso() {
        return urlAcesso;
    }

    public String getReqLeitura() {
        return reqLeitura;
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
    
    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setNumLicencas(int numLicencas) {
        this.numLicencas = numLicencas;
    }

    public void setUrlAcesso(String urlAcesso) {
        this.urlAcesso = urlAcesso;
    }

    public void setReqLeitura(String reqLeitura) {
        this.reqLeitura = reqLeitura;
    }
    
    
}
