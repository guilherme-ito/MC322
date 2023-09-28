package biblioteca.models.exceptions;

public class ReservandoSala extends Exception {
	
//	fields
	private String numSala;
	int x;

	
//	constructor
	public ReservandoSala(String numSala,int x) {
		this.numSala=numSala;
		this.x=x;
	}
	
	public String toString(int x) {
		if (x==1){
		return "A sala"+numSala+" não está disponivel nomomento";
		}
		else {
			return "A sala"+numSala+" está lotada no nomomento";
		}
		}
	}
	

