package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

import biblioteca.models.emprestimo.Emprestimo;
import biblioteca.models.allMembros.*;
import biblioteca.models.item .*;

public class BibliotecaControllerImpl implements BibliotecaController {
	
//	fields
    private List<ItemMultimidia> itens;
    private Map<Integer,ItemMultimidia> mapaItens;
    private Set<Emprestimo> emprestimos;
    
    Scanner scanner = new Scanner(System.in);
    
//	constructor
    public BibliotecaControllerImpl() {
        itens = new ArrayList<>();
        mapaItens=new HashMap<>();
        emprestimos=new TreeSet<>();// temo que arrumar a classe emprestimo
    }
    
    
//    methods
    public void adcItemId(Scanner scanner) {
    	System.out.println("digite os atributos do item");
    	String titulo =scanner.nextLine();
    	String idioma =scanner.nextLine();
    	String genero =scanner.nextLine();
    	int lancamento=scanner.nextInt();
    	boolean disponivel=scanner.nextBoolean();
    	String sinopse=scanner.nextLine();
    	String capa =scanner.nextLine();
    	String classificacao =scanner.nextLine();
    	int id= scanner.nextInt();
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

    @Override
    public List<ItemMultimidia> consultarItensDisponiveis() {
    	for (Map.Entry<Integer, ItemMultimidia> entry : mapaItens.entrySet()) {
    	    Integer chave = entry.getKey();
    	    ItemMultimidia valor = entry.getValue();
    	    if(valor.isDisponivel()) {
    	    	itens.add(valor);   	   
    	   	}
//    	    itera os elementos do mapa e adc a lista os disponiveis
    	}
        return itens;
    }

    @Override
    public boolean emprestarItem(Membro membro, ItemMultimidia item) {
       if (item.isDisponivel()) {
    	   item.setDisponivel(false);
       }
       else {
    	   System.out.println("Livro indisponivel no momento");
       }
        return true;
    }

    @Override
    public boolean devolverItem(Membro membro, ItemMultimidia item) {
        item.setDisponivel(true);
        return true;
    }
}