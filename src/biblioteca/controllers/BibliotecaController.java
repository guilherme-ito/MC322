package biblioteca.controllers;

import java.util.List;

import biblioteca.models.allMembros.*;
import biblioteca.models.item .*;
import biblioteca.views.BibliotecaView;

public interface BibliotecaController {
    List<ItemMultimidia> consultarItensDisponiveis();
    boolean emprestarItem(Membro membro, ItemMultimidia item);
    boolean devolverItem(Membro membro, ItemMultimidia item);
}
