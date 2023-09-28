package biblioteca.models.exceptions;

public class Sistemaexc extends Exception {
//	fields
	private int opcao;
	
//	constructor
	public Sistemaexc(int opcao) {
		this.opcao=opcao;
		
	}
	public String toString(int opcao) {
		if(opcao==1) {
			return("Não tem permissão para realizar esta ação");
		}
		else {
			return("credenciais estão inválidas");
		}
		
		
	}
	
	
}
