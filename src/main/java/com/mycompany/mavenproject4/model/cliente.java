/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Michael
 */

@Entity
public class cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cliente;
    private String nome;
    private int telefone;

    private String cpf;
    // cpf tem que ser String, porque se começar com "0" o computador "trunca" e na hora de adicionar no banco
    // de dados como um int ele remove esse zero inicial.
    
    
    // precisa implementar getters and setters
}
