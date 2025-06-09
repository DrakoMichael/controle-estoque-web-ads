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
public class vendedor {
    
    @Id
    private String id_vendedor;
    private String nome;
    private String cpf;
    

    public String getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(String id_vendedor) {
        this.id_vendedor = id_vendedor;
    }
}
