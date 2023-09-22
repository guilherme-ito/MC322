package biblioteca.models.allMembros.funcionarios;

import biblioteca.models.allMembros.TipoMembro;

public class Gerente extends Funcionario{

//	fields
	private static int prazo;
//	constructor
	public Gerente (String nome, String registro,String endereco,String contato,String dataRegistro,
    		String cargo) {
		super(nome, registro,endereco,contato,dataRegistro,cargo);
		prazo=2;
	}
	
	
//	methods
	
//	getters
	
//	setters

}

