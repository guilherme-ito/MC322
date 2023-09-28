package biblioteca.models.exceptions;

public class CadItemMult extends Exception {
	
//	fields
	
	int x;

	
//	constructor
	public CadItemMult(int x) {
		
		this.x=x;
	}
	
	public String toString(int x) {
		if (x==1){
		return "ISBN já presente no banco de dados";
		}
		else if(x==2){
			return "id já presente nobanco de dados";
		}
		else {
			return "por vaor insira um formato válido para o item";
		}
		}

}
