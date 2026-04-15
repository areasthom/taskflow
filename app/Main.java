package com.thom.taskflow.app;

import com.thom.taskflow.controller.SistemaTarefas;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        SistemaTarefas sistema = new SistemaTarefas();
        
        int opcao;
        
        do
        {            
            System.out.println("\n=== TASK FLOW ===");
            System.out.println("1 - Criar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = teclado.nextInt();
            teclado.nextLine();
            
            if(opcao == 1)
            {
                System.out.println("Titulo da tarefa: ");
                String titulo = teclado.nextLine();
                
                System.out.println("Descrição da tarefa: ");
                String descricao = teclado.nextLine();
                
                sistema.criarTarefa(titulo, descricao);
            }
            
            else if(opcao == 2)
            {
                sistema.listarTarefas();
            }
            
            else if(opcao == 3)
            {
                System.out.println("Digite o numero da tarefa: ");
                int index = teclado.nextInt();
                teclado.nextLine();
                
                sistema.marcarComoConcluida(index);           
            }
            else if(opcao == 4)
            {
                System.out.println("Digite o numero da tarefa: ");
                int index = teclado.nextInt();
                teclado.nextLine();
                
                sistema.excluirTarefa(index);
            }
            
            else if(opcao == 0)
            {
                System.out.println("Até a próxima! ");
            }
            
            else
            {
                System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0);
            teclado.close();
    }
}
