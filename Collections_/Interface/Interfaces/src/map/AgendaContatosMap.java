package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatosMap {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatosMap() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {

        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.get(nome);

        }
        return numeroPorNome;
    }

}
