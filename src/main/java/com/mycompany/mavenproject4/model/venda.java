package com.mycompany.mavenproject4.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_venda;

    @Temporal(TemporalType.TIMESTAMP)
    private Date data_venda;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_vendedor")
    private vendedor vendedor;

    // auto-gerado pela IA, precisa revisar
    // Relacionamento OneToMany com item_venda
    // "venda" é o nome do campo na classe item_venda que mapeia de volta para esta Venda
    @OneToMany(mappedBy = "venda", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<item_venda> itens = new ArrayList<>();

    private int total;

    // precisa implementar getters and setters
}
