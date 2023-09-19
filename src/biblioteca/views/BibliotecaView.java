package biblioteca.views;

import java.util.List;

import biblioteca.models.item.Item;//checar

public interface BibliotecaView {
    void mostrarItensDisponiveis(List<Item> itens);//checar
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
    
}