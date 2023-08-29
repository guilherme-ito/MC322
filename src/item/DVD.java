package item;

public class DVD extends Item{

//	fields
	
	String duracao;
	
//	constructor
	public DVD(String titulo,String idioma,String genero,int lancamento,boolean disponivel,String sinopse,String capa, String classificacao,String duracao) {
		super(titulo,idioma,genero,lancamento,disponivel,sinopse,capa,classificacao);
		this.duracao=duracao;
	}

//	methods
	
//	getters
	

    public String getDuracao() {
        return duracao;
    }

//	setters
   
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
	

	
}
