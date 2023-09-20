package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import biblioteca.models.allMembros.*;
import biblioteca.models.item .*;

public class BibliotecaControllerImpl implements BibliotecaController {
	
//	fields
    private List<Item> itens;
    
//	constructor
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