package membros;

import item.Item;

public abstract class Membro {

	
//  fields
	private String nome;
    private String registro;
    private String endereco;
    private String contato;
    private String dataRegistro;
    
   
    
//  constructor
    public Membro(String nome, String registro,String endereco,String contato,String dataRegistro) {
        this.nome = nome;
        this.registro = registro;
        this.endereco=endereco;
        this.contato=contato;
        this.dataRegistro=dataRegistro;
        
    }
    
//  methods
    
    
//  getters
    public String getNome() {
        return nome;
    }
    public String getRegistro() {
        return registro;
    }
    public String getEndereco() {
        return endereco;
    }

    public String getContato() {
        return contato;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }
    


   
//  setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
   
    
}