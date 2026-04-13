/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.thom.taskflow.model;

import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author thoml
 */
@Getter
@Setter
public class Tarefa {

    private String titulo;
    private String descricao;
    private boolean concluida;

    public Tarefa(String titulo, String descricao)
    {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }
    
    public void marcarComoConcluida()
    {
        this.concluida = true;
    }
    
    public void mostrarTarefa()
    {
        System.out.println("--------------------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Status: " + (concluida ? "Concluida" : "Pendente"));
        System.out.println("--------------------");

    }
    
}
