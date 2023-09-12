package biblioteca.controllers;

import java.util.List;

import biblioteca.models.item .*;
import biblioteca.models.membros.*;
import biblioteca.views.BibliotecaView;

public interface BibliotecaController {
    List<Item> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, Item item);
    boolean devolverItem(Membro membro, Item item);
}