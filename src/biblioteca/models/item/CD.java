package biblioteca.models.item;

public class CD extends Item {

//	fields
	private String faixas;//lista
	private String duracao;
	private int exemplares;
	private String conservacao;//enum?
	//disponiveis
	
	
//	constructor
	public CD(String titulo,String idioma,String genero,int lancamento,boolean disponivel,
			String sinopse,String capa,String classificacao,int id,
			String faixas, String duracao,int exemplares, String conservacao) {
		
		super(titulo,idioma,genero,lancamento,disponivel,sinopse,capa,classificacao,id);
		this.faixas=faixas;
		this.duracao=duracao;
		this.exemplares=exemplares;
		this.conservacao=conservacao;
		
	}
	
//	methods
	
	

//  getters
  public String getFaixas() {
      return faixas;
  }
  public String getDuracao() {
      return duracao;
  }

  public int getExemplares() {
      return exemplares;
  }

  public String getConservacao() {
      return conservacao;
  }

//setters
  public void setFaixas(String faixas) {
      this.faixas = faixas;
  }
  public void setDuracao(String duracao) {
      this.duracao = duracao;
  }

  public void setExemplares(int exemplares) {
      this.exemplares = exemplares;
  }

  public void setConservacao(String conservacao) {
      this.conservacao = conservacao;
  }
}
