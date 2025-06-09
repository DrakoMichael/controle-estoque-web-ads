/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Michael
 * 
 * 
 * essa classe tem que ser Serializable, é altamente recomendado
 * perguntem pro chatGPT que ele responde bastante coisa sobre
 * 
 * Esses @ na frente das classes são "anotações" vem do framework JPA (Java Persistence API)
 * serve pra definir regras e configurações com o banco de dados
 * 
 */

@Entity
public class item_venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_item;


    private int id_venda;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private produto produto;

    private int quantidade;

    private int preco_unitario;

    private int subtotal;

    // precisa implementar Getters e Setters 

}