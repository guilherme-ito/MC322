package biblioteca.models.emprestimo;

import biblioteca.models.allMembros.Membro;
import biblioteca.models.item.Item;

public class Reserva {
	
//	fields
	    private Membro membro;
	    private Item item;
	    private String dataReserva;
	    
	    
//	    constructor

	    public Reserva(Membro membro, Item item, String dataReserva) {
	        this.membro = membro;
	        this.item = item;
	        this.dataReserva = dataReserva;
	    }
	    
//	    methods
//	    public int compareTo(Reserva outro) {
//	    	return this.dataReserva.compareTo(outro.dataReserva);
//	    } como que vai funcionar isso?

	    
//	    getters
	    public Membro getMembro() {
	        return membro;
	    }


	    public Item getItem() {
	        return item;
	    }

	    public String getDataReserva() {
	    	return dataReserva;
	    }
	    
//	    setetrs
	    public void setMembro(Membro membro) {
	    	this.membro = membro;
	    }
	    public void setItem(Item item) {
	        this.item = item;
	    }


	    public void setDataReserva(String dataReserva) {
	        this.dataReserva = dataReserva;
	    }
	
}
