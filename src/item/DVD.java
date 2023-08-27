package item;

public class DVD extends Item{

//	fields
	String classificacao;
	String duracao;
	
//	constructor
	public DVD(String titulo,String idioma,String genero,int lancamento,boolean disponivel, String classificacao,String duracao) {
		super(titulo,idioma,genero,lancamento,disponivel);
		this.classificacao=classificacao;
		this.duracao=duracao;
	}

//	methods
	
//	getters
	public String getClassificacao() {
        return classificacao;
    }

    public String getDuracao() {
        return duracao;
    }

//	setters
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
	

	
}
