package biblioteca.models.generics;
import models.enums;

public class ItemBiblioteca<T> {
    
    //	Atributos
    private T item;
    private String titulo;
    private int id;
    private Status status;

    // Construtor
    public ItemBiblioteca(T item,String titulo,int id, Status status) {
        this.item = item;
        this.titulo = titulo;
        this.id = id;
        this.status = status;
    }
    // Métodos
    public void emprestar () {
        if (status == Status.disponivel) {
            System.out.println("O item" + item.toString() + "está disponível para empréstimo");
            status = Status.emprestado;
        } 
        if (status == Status.emprestado) {
            System.out.println("O item" + item.toString() + "está emprestado ");
        }
        if (status == Status.reservado) {
            System.out.println("O item" + item.toString() + "está reservado");
        }
    }

    public void devolver () {
        if (status != Status.reservado) {
        status = Status.disponivel;
        }
    }

    public void reservar () {
        if (status != Status.reservado) {
            status = Status.reservado;
        }
    }

}
