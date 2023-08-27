package membros;

import item.Item;

public abstract class Membro {

	
//  fields
	private String nome;
    private String registro;
    private int prazo;// colocar nos constructors específicos
    private int limiteItens;
    private Item[] emprestados;//lista de itens emprestado do membro
//  private int multa? em dias
    
    
//  private List<Emprestimo> historicoEmprestimos = new ArrayList<>();
    
//  constructor
    public Membro(String nome, String registro) {
        this.nome = nome;
        this.registro = registro;
        
    }
    
//  methods
    
    
//  getters
    public String getNome() {
        return nome;
    }
    public String getRegistro() {
        return registro;
    }
    public int getPrazo() {
        return prazo;
    }
    public Item[] getEmprestados() {
        return emprestados;
    }
    public int getLimiteItens() {
        return limiteItens;
    }


   
//  setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }
  
    public void setEmprestados(Item[] emprestados) {
        this.emprestados = emprestados;
    }
    public void setLimiteItens(int limiteItens) {
        this.limiteItens = limiteItens;
    }
    
    
}