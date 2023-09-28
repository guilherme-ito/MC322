package biblioteca.models.item;

import biblioteca.models.emprestimo.Emprestimo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import biblioteca.models.allMembros.*;;

public abstract class ItemMultimidia {
	
//	fields
	private String titulo;
	private String idioma;
	private String genero;
	private int lancamento;//ano de lançamento
	Emprestimo emprestado;
	private String sinopse;
	private String capa;
	private String classificacao;
	private int id;
	private List<Comentario> comentariosItem;
	private Status status;
	private Membro membro;
	private Estado estado;

	Scanner scanner = new Scanner(System.in);
	
//	lista de espera pro item
	
//	constructor
	public ItemMultimidia(String titulo,String idioma,String genero,int lancamento,
			String sinopse,String capa, String classificacao, int id,Status status, Membro membro, Estado estado) {
		this.titulo=titulo;
		this.idioma=idioma;
		this.genero=genero;
		this.lancamento=lancamento;
		this.sinopse=sinopse;
		this.capa=capa;
		this.classificacao=classificacao;
		this.id=id;
		comentariosItem= new ArrayList<>();
		this.status = status;
		this.membro = membro;
		this.estado = estado;
	}
	
//	methods
	
	public void adcComentario(Scanner scanner) {
		
		int membroId=scanner.nextInt();
		int itemId=scanner.nextInt();
		String texto=scanner.nextLine();
		comentariosItem.add(new Comentario(membroId,itemId,texto));
	}

//	getters
	 public String getTitulo() {
	        return titulo;
	    }
		
		public Status getStatus() {
			return status;
		}
	   

	    public String getIdioma() {
	        return idioma;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public int getLancamento() {
	        return lancamento;
	    }
	    
	    public String getSinopse() {
	        return sinopse;
	    }

	    public String getCapa() {
	        return capa;
	    }
	    public String getClassificacao() {
	        return classificacao;
	    }
	    public int getId() {
	        return id;
	    }

		public Membro getMembro() {
			return membro;
		}

		public Estado getEstado() {
			return estado;
		}
	    

//	setters
	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }


	    public void setIdioma(String idioma) {
	        this.idioma = idioma;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public void setLancamento(int lancamento) {
	        this.lancamento = lancamento;
	    }

	    public void setSinopse(String sinopse) {
	        this.sinopse = sinopse;
	    }

	    public void setCapa(String capa) {
	        this.capa = capa;
	    }
	    
	    public void setClassificacao(String classificacao) {
	        this.classificacao = classificacao;
	    }
	    public void setId(int novoId) {
	        id = novoId;
	    }

		public void setStatus(Status status) {
			this.status = status;
		}

		public void setMembro(Membro membro) {
			this.membro = membro;
		}

		public void setEstado(Estado estado) {
			this.estado = estado;
		}

		enum Status{
			DISPONIVEL,EMPRESTADO,RESERVADO
		}

		enum Estado {
			PÉSSIMO, RUIM, ACEITÁVEL, BOM, ÓTIMO, NOVO
		}
}
