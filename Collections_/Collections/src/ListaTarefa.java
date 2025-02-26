
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    // construtor gerado para retornar arraylist vazio.sem param
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        // o metodo adiciona uma nova tarefa com a descricao ja
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        // o metodo adiciona uma nova tarefa com a descricao ja
        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int numeroTotalTarefas() {
        return tarefaList.size();

    }

    public void obterDescricoes() {
        System.out.println(tarefaList);

    }

}
