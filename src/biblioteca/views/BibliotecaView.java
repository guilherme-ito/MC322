package biblioteca.views;

import java.util.List;

import biblioteca.models.item.ItemMultimidia;//checar

public interface BibliotecaView {
    void mostrarItensDisponiveis(List<ItemMultimidia> itens);//checar
    void mostrarEmprestimoStatus(boolean sucesso);
    void mostrarDevolucaoStatus(boolean sucesso);
    
}