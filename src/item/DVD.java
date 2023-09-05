package item;

public class DVD extends Item{

//	fields
	
	private String elenco;
	private String duracao;
	private int exemplares;
	private String conservacao;
	private String legendaAudio;
	
	//exemplares disponiveis
	
//	constructor
	public DVD(String titulo,String idioma,String genero,int lancamento,boolean disponivel,String sinopse,String capa, String classificacao,
			String elenco,String duracao,int exemplares,String conservacao, String legendaAudio) {
		
		super(titulo,idioma,genero,lancamento,disponivel,sinopse,capa,classificacao);
		
		this.elenco=elenco;
		this.duracao=duracao;
		this.exemplares=exemplares;
		this.conservacao=conservacao;
		this.legendaAudio=legendaAudio;
		
	}

//	methods
	
//	getters
	

    public String getDuracao() {
        return duracao;
    }
    
    public String getElenco() {
        return elenco;
    }

    public int getExemplares() {
        return exemplares;
    }

    public String getConservacao() {
        return conservacao;
    }

    public String getLegendaAudio() {
        return legendaAudio;
    }

//	setters
   
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public void setConservacao(String conservacao) {
        this.conservacao = conservacao;
    }

    public void setLegendaAudio(String legendaAudio) {
        this.legendaAudio = legendaAudio;
    }
	

	
}
