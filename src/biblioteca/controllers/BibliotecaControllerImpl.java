package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import biblioteca.models.emprestimo.Emprestimo;
import biblioteca.models.emprestimo.Reserva;
import biblioteca.models.allMembros.*;
import biblioteca.models.allMembros.funcionarios.Funcionario;
import biblioteca.models.item .*;

public class BibliotecaControllerImpl implements BibliotecaController {
	
//	fields
    private List<Item> itens;
    private Map<Integer,Item> mapaItens;
    private Set<Emprestimo> emprestimos;
    private List<Reserva> reservas;
    private Set<Categoria> categorias;
    
    Scanner scanner = new Scanner(System.in);
    
//	constructor
    public BibliotecaControllerImpl() {
        itens = new ArrayList<>();
        mapaItens=new HashMap<>();
        emprestimos=new TreeSet<>();
        reservas=new ArrayList<>();
    }
    
    
//    methods
    
    
//    adc reserva
    public boolean adcReserva() {
    	return true;
    }
    
//    remove a reserva
    public boolean removerReserva() {
    	return true;
    }
    
      
    public boolean adcEmprestimo(Membro usuario,Item recurso,Funcionario  emprestador,String dataEmprestimo,String dataDevolucao) {
    	
    	for(Emprestimo emprestimo:emprestimos) {
    		if(emprestimo.getRecurso().getId()==recurso.getId()) {
    			System.out.println("Esse item já está emprestado");
//    			adc a lista de reservas
    			return false;
    		}
    	}
    	emprestimos.add(new Emprestimo(usuario,recurso,emprestador,dataEmprestimo,dataDevolucao));
    	System.out.println("emprestimo realizado com sucesso");
    	return true;
    }
    
//    retorna o emprestimo
    public boolean retornarEmprestimo(int id) {
    	for(Emprestimo emprestimo:emprestimos) {
    		if(emprestimo.getRecurso().getId()==id) {
    			emprestimos.remove(emprestimo);
//    			prox da lista de reservas deve receber esse item
    			return true;
    		}
    	}
    	System.out.println("Esse item não está emprestado");
    	return false;
    }
//    adc item ao map de (id,itens)
    public void adcItemId(Scanner scanner) {
    	System.out.println("digite os atributos do item");
    	int id= scanner.nextInt();
    	String titulo =scanner.nextLine();
    	String idioma =scanner.nextLine();
    	String genero =scanner.nextLine();
    	int lancamento=scanner.nextInt();
    	boolean disponivel=scanner.nextBoolean();
    	String sinopse=scanner.nextLine();
    	String capa =scanner.nextLine();
    	String classificacao =scanner.nextLine();
    	System.out.println("qual tipo de item voce quer adc?(LivroDigital,LivroFisico,DVD ou CD");
    	String tipo=scanner.nextLine();
    	String autor;
    	int edicao;
    	int paginas;
    	String conservacao;
    	int exemplares;
    	String duracao;
    	switch (tipo) {
        case "LivroDigital":
        	autor=scanner.nextLine();
            edicao= scanner.nextInt();
            paginas= scanner.nextInt();
            int tamanhoArquivo= scanner.nextInt();
            String formato=scanner.nextLine();
            int numLicencas= scanner.nextInt();
            String urlAcesso=scanner.nextLine();
            String reqLeitura=scanner.nextLine();
            mapaItens.put(id, new LivroDigital(titulo,idioma,genero,lancamento,disponivel,sinopse,capa,classificacao,id,autor,edicao
            		,paginas,tamanhoArquivo,formato,numLicencas,urlAcesso,reqLeitura));
            
            break;
        case "LivroFisico":
        	autor=scanner.nextLine();
        	String editora=scanner.nextLine();
        	edicao= scanner.nextInt();
        	paginas= scanner.nextInt();
        	exemplares= scanner.nextInt();
        	String isbn=scanner.nextLine();
        	conservacao=scanner.nextLine();
        	String localizacao=scanner.nextLine();
        	mapaItens.put(id, new LivroFisico(titulo,idioma,genero,lancamento,disponivel,sinopse,capa
        			,classificacao,id,autor,editora,edicao,paginas,exemplares,isbn,conservacao,localizacao));
        	
            break;
        case "CD":
        	String faixas=scanner.nextLine();
        	duracao=scanner.nextLine();
        	exemplares= scanner.nextInt();
            conservacao =scanner.nextLine();
            mapaItens.put(id, new CD(titulo,idioma,genero,lancamento,disponivel,sinopse,capa
        			,classificacao,id,faixas,duracao,exemplares,conservacao));
            
            break;
        case "DVD":
        	String elenco=scanner.nextLine();
        	duracao=scanner.nextLine();
        	exemplares= scanner.nextInt();
        	conservacao=scanner.nextLine();
        	String legendaAudio=scanner.nextLine();
        	mapaItens.put(id, new DVD(titulo,idioma,genero,lancamento,disponivel,sinopse,capa
        			,classificacao,id,elenco,duracao,exemplares,conservacao,legendaAudio));
            
            break;
        default:
            System.out.println("Escolha uma das opções listadas anteriormente");
    }
    	
    }
    
//   adc os itens disponíveis a uma lista
    @Override
    public List<Item> consultarItensDisponiveis() {
    	for (Map.Entry<Integer, Item> entry : mapaItens.entrySet()) {
    	    Integer chave = entry.getKey();
    	    Item valor = entry.getValue();
    	    if(valor.isDisponivel()) {
    	    	itens.add(valor);   	   
    	   	}
//    	    itera os elementos do mapa e adc a lista os disponiveis
    	}
        return itens;
    }
//    empresta item a um membro
    @Override
    public boolean emprestarItem(Membro membro, Item item) {
       if (item.isDisponivel()) {
    	   item.setDisponivel(false);
       }
       else {
    	   System.out.println("Livro indisponivel no momento");
       }
        return true;
    }
    
//    devolve o item 
    @Override
    public boolean devolverItem(Membro membro, Item item) {
        item.setDisponivel(true);
        return true;
    }
}