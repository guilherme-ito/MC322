package biblioteca.views;

import java.util.List;

import biblioteca.models.membros.Membro;//checar aqui

public interface MembroView {
    void mostrarListaMembros(List<Membro> membrosList);
    void mostrarDetalhesMembro(Membro membroDet);
}