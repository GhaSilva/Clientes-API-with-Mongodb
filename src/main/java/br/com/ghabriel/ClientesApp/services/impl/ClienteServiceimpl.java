package br.com.ghabriel.ClientesApp.services.impl;

import java.util.List;
import java.util.Optional;

import org.bson.BsonBinary;
import org.bson.BsonValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.client.model.vault.DataKeyOptions;
import com.mongodb.client.model.vault.EncryptOptions;
import com.mongodb.client.vault.ClientEncryption;

import br.com.ghabriel.ClientesApp.documents.Cliente;
import br.com.ghabriel.ClientesApp.repository.ClienteRepository;
import br.com.ghabriel.ClientesApp.services.ClienteService;

@Service
public class ClienteServiceimpl implements ClienteService, ClientEncryption {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public BsonBinary createDataKey(String kmsProvider) {
		return null;
	}

	@Override
	public BsonBinary createDataKey(String kmsProvider, DataKeyOptions dataKeyOptions) {
		return null;
	}

	@Override
	public BsonBinary encrypt(BsonValue value, EncryptOptions options) {
		return null;
	}

	@Override
	public BsonValue decrypt(BsonBinary value) {

		return null;
	}

	@Override
	public void close() {


	}

	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> listarPorId(String id) {
		return this.clienteRepository.findById(id);
	}

	@Override
	public Cliente cadastrar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}

	@Override
	public void remover(String id) {
		this.clienteRepository.deleteById(id);
	}

}
