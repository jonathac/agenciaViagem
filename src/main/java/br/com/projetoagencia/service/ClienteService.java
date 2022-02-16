package br.com.projetoagencia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoagencia.model.Cliente;
import br.com.projetoagencia.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	// criar cliente
	public boolean create(Cliente cliente) {
		try {
			this.clienteRepository.save(cliente);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
