package com.example.dataBaseService.models;

import com.example.dataBaseService.interfaces.SkuPrefixRules;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class produto implements SkuPrefixRules {
    
    public produto(String desc,int preco, int estoque) {
        this.descricao = desc;
        this.preco_unitario = preco;
        this.estoque_atual = estoque;  
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_produto;

    private String descricao;
    private int preco_unitario;
    private int estoque_atual;
    
    public int getId_produto() {
        return id_produto;
    }

    public void setPreco_unitario(int preco_unitario) {
        this.preco_unitario = preco_unitario;
    }
    public int getPreco_unitario() {
        return preco_unitario;
    }

    public void setEstoque_atual(int estoque_atual) {
        this.estoque_atual = estoque_atual;
    }
    public int getEstoque_atual() {
        return estoque_atual;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }   
    public String getDescricao() {
        return descricao;
    }
}
    


