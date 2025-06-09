package com.example.dataBaseService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dataBaseService.models.produto;

@SpringBootApplication
public class DataBaseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataBaseServiceApplication.class, args);
                
                //cria um novo produto teste e já insere no banco de dados
		produto produto = new produto("Produto Exemplo", 100, 50);
		System.out.println(produto.getDescricao());
	}
        
        //instalem o pgAdmin 4, façam um banco de dados com o nome que quiser e só
        //configurem no arquivo resources>application.properties
        //assim já vai criar um produto no banco de dados
}
