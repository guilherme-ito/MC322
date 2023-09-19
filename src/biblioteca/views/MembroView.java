package biblioteca.views;

import java.util.List;

import biblioteca.models.allMembros.Membro;

public interface MembroView {
    void mostrarListaMembros(List<Membro> membrosList);
    void mostrarDetalhesMembro(Membro membroDet);
}