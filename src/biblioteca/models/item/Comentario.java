package biblioteca.models.item;




public class Comentario {

//	fields
	private int membroId;
	private int itemId;
	private String texto;
	
//	constructor
	public Comentario(int membroId,int itemId,String texto) {
		this.membroId=membroId;
		this.itemId=itemId;
		this.texto=texto;
		
	}
	
//	methods
	
	
//	getters 
	public int getMembroId() {
        return membroId;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTexto() {
        return texto;
    }
	
//	setters
    public void setMembroId(int membroId) {
        this.membroId = membroId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
	
}
