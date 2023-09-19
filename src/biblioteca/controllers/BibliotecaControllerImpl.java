package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;

import biblioteca.models.allMembros.*;
import biblioteca.models.item .*;

public class BibliotecaControllerImpl implements BibliotecaController {
    private List<Item> itens;

    public BibliotecaControllerImpl() {
        itens = new ArrayList<>();
    }

    @Override
    public List<Item> consultarItensDisponiveis() {
        return itens;
    }

    @Override
    public boolean emprestarItem(Membro membro, Item item) {
        // Lógica de empréstimo
        return true;
    }

    @Override
    public boolean devolverItem(Membro membro, Item item) {
        // Lógica de devolução
        return true;
    }
}