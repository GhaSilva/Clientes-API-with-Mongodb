package br.com.ghabriel.ClientesApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.ghabriel.ClientesApp.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String>{

}
