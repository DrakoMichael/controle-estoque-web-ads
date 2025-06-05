/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Michael
 */
@Entity
public class produto {
    @Id
    private String id_produto;
    private String Descricao;
    private int preco_unitario;
    private int estoque_atual;

    public String getId_produto() {
        return id_produto;
    }

    public void setId_produto(String id_produto) {
        this.id_produto = id_produto;
    }
}
