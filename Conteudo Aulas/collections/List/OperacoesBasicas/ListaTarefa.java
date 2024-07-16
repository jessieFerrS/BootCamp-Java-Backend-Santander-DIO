package collections.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;


    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // adiciona uma nova tarefa
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // remove as tarefas com essa descricao, não importa se tem tarefas repetidas
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // retorna o numero de tarefas existentes
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    //imprime a lista das tarefas
    public void obterDescicoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O NUMERO TOTAL DE ELEMENTOS NA LISTA É: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O NUMERO TOTAL DE ELEMENTOS NA LISTA É: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O NUMERO TOTAL DE ELEMENTOS NA LISTA É: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescicoesTarefas();
    }
}
