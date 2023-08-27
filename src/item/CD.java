package item;

public class CD extends Item {
	
//	fields
	int faixas;
	
	
//	constructor
	public CD(String titulo,String idioma,String genero,int lancamento,boolean disponivel,int faixas) {
		super(titulo,idioma,genero,lancamento,disponivel);
		this.faixas=faixas;
	}
	
//	methods
	
	

//  getters
  public int getFaixas() {
      return faixas;
  }

//setters
  public void setFaixas(int faixas) {
      this.faixas = faixas;
  }
  
}
