package com.thom.taskflow.controller;

import com.thom.taskflow.model.Tarefa;
import java.util.ArrayList;

public class SistemaTarefas
{
    private ArrayList<Tarefa> tarefas;

    public SistemaTarefas()
    {
        this.tarefas = new ArrayList<>();
    }
    
    public void criarTarefa(String titulo, String descricao)
    {
        for(Tarefa t : tarefas)
        {
            if(t.getTitulo().equalsIgnoreCase(titulo))
            {
                System.out.println("Já existe uma tarefa com esse titulo! ");
                return;
            }
        }
        
        Tarefa tarefa = new Tarefa(titulo, descricao);
        tarefas.add(tarefa);
        System.out.println("Tarefa criada com sucesso! ");
        
    }
    
    public void listarTarefas()
    {
        if(tarefas.isEmpty())
        {
            System.out.println("Ainda nao existem tarefas! ");
        }
        else
        {
            for (int i = 0; i < tarefas.size(); i++)
            {
                System.out.print((i + 1) + " - ");
                tarefas.get(i).mostrarTarefa();
            }
        }
    }
    
    public void marcarComoConcluida(int index)
    {
        if(index < 1 || index > tarefas.size())
        {
            System.out.println("Tarefa invalida. ");
            return;
        }
        
        Tarefa tarefa = tarefas.get(index - 1);
        
        if(tarefa.isConcluida())
        {
            System.out.println("Essa tarefa já está concluida! ");
            return;
        }
        
        tarefa.marcarComoConcluida();
        System.out.println("Tarefa concluida com sucesso! ");
        
    }
    
    public void excluirTarefa(int index)
    {
        if(index < 1 || index > tarefas.size())
        {
            System.out.println("Tarefa invalida. ");
            return;
        }
        
        this.tarefas.remove(index - 1);
        System.out.println("Tarefa excluida com sucesso! ");
        
    }       
    
    public int totalTarefa()
    {
        return tarefas.size();
    }
    
}
