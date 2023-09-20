package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import biblioteca.models.allMembros .*;
import biblioteca.models.allMembros.funcionarios.Administrador;//pq eu tenho que importar duas vzs?
import biblioteca.models.allMembros.Membro;



public class MembroControllerImpl implements MembroController {
//	fields
    private List<Membro> membros;
    
//    constructor
    public MembroControllerImpl() {
        membros = new ArrayList<>();
    }
    
    Scanner scanner = new Scanner(System.in);
    
//    methods
    
//    @Override
//    public String toString() {
//    	switch (this.getTipo()) {
//    	case "GRAD":
//   	     System.out.println("membro do tipo GRAD");
//   	     return (this.);
//   	     break;
//   	 case "POSGRAD":
//   	     System.out.println("membro do tipo POSGRAD");
//   	     
//   	     break;
//   	 case "PROF":
//   	      System.out.println("membro do tipo PROF");
//   	      break;
//   	 case "FUNC":
//   	     System.out.println("membro do tipo FUNC");
//   	     String cargo=scanner.nextLine();
//   	     switch (cargo) {
//   	     case "Admin":
//   	         System.out.println("Func do tipo Admin");
//   	     case "Atendente":
//   	     System.out.println("Func do tipo Atendente");
//   	         break;
//   	     case "Gerente":
//   	     System.out.println("Func do tipo Gerente");
//   	         break;
//   	     default:
//   	         System.out.println("Opção inválida.");
//   	 }
//   	     break;
//   	 default:
//   	     System.out.println("Opção inválida.");
//   	}
//    	return "oi";
//    }
//     tenho que fazer em cada classse o toString na classe membros na real
    
    @Override
    public List<Membro> listarMembros() {
    	for(Membro x:membros) {
    		System.out.println(x);//sobrescrever tostring
    	}
        return membros;
    }

    @Override
    public Membro buscarMembroPorIdentificacao(String identificacao) {//fazer
        // Lógica de busca
        return null;
    }
    
    public void adicMembro(Scanner scanner) {
    	System.out.println("digite o nome , registro, endereço,contato, data de registro e tipo do membro");
    	String nome=scanner.nextLine();
    	String registro=scanner.nextLine();
    	String endereco=scanner.nextLine();
    	String contato=scanner.nextLine();
    	String dataRegistro=scanner.nextLine();
    	String tipoMembro=scanner.nextLine();
    	switch (tipoMembro) {
    	 case "GRAD":
    	     System.out.println("membro do tipo GRAD");
    	     String curso=scanner.nextLine();
    	     membros.add(new Graduacao(nome, registro, endereco,contato,dataRegistro,
    	                curso));
    	     break;
    	 case "POSGRAD":
    	     System.out.println("membro do tipo POSGRAD");
    	     String programa=scanner.nextLine();
    	     membros.add(new PosGraduacao(nome,registro,endereco,contato,dataRegistro,programa));
    	     break;
    	 case "PROF":
    	      System.out.println("membro do tipo PROF");
    	      String departamento=scanner.nextLine();
    	      membros.add(new Professor(nome,registro,endereco,contato,dataRegistro,departamento));
    	      break;
    	 case "FUNC":
    	     System.out.println("membro do tipo FUNC");
    	     String cargo=scanner.nextLine();
    	     switch (cargo) {
    	     case "Admin":
    	         System.out.println("Func do tipo Admin");
    	         membros.add(new Administrador(nome,registro,endereco,contato,dataRegistro,cargo));
    	         break;
    	     case "Atendente":
    	     System.out.println("Func do tipo Atendente");
    	     membros.add(new Administrador(nome,registro,endereco,contato,dataRegistro,cargo));
    	         break;
    	     case "Gerente":
    	     System.out.println("Func do tipo Gerente");
    	     membros.add(new Administrador(nome,registro,endereco,contato,dataRegistro,cargo));
    	         break;
    	     default:
    	         System.out.println("Opção inválida.");
    	 }
    	     break;
    	 default:
    	     System.out.println("Opção inválida.");
    	}
    	
    }
    
    public void removeMembro(String removeRegistro) {
    	for(Membro x : membros) {
    		if (x.getRegistro()==removeRegistro) {
    			membros.remove(x);
    			break;
    		}
    	} 	
    }
    
    
    
    
    
}

