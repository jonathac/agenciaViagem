package br.com.projetoagencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoagencia.model.Cliente;
import br.com.projetoagencia.repository.ClienteRepository;
import br.com.projetoagencia.service.ClienteService;

@Controller
@RequestMapping("/")
public class CadastroController {

	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("cadastro")
	public String getCadastro(Model model) {
		Cliente cliente = new Cliente();

		model.addAttribute("cliente", cliente);
		return "/cadastro";
	}

	@PostMapping("cadastrar")
	public String postCadastro(Cliente cliente) {
		if(this.validaCadastro(cliente)){
			ClienteService clienteSer = this.getClienteService();
			//clienteService = getClienteService();
			clienteSer.create(cliente);
			return "redirect:/login";
		} else {
			return "redirect:/cadastro?cadastroinvalido";
		}
		
	}
	
	public ClienteService getClienteService() {
		return new ClienteService(this.clienteRepository);
	}

	//valida informações do cadastro
	public boolean validaCadastro(Cliente cliente) {
		//valida campo vaizo ou nulo
		if(cliente.getNome().isEmpty() || cliente.getNome() == null)
			return false;
		if(cliente.getCpf().isEmpty() || cliente.getCpf() == null)
			return false;
		if(cliente.getTelefone().isEmpty() || cliente.getTelefone() == null)
			return false;
		if(cliente.getEmail().isEmpty() || cliente.getEmail() == null)
			return false;
		if(cliente.getSenha().isEmpty() || cliente.getSenha() == null)
			return false;
		if(cliente.getRua().isEmpty() || cliente.getRua() == null)
			return false;
		if(cliente.getCidade().isEmpty() || cliente.getCidade() == null)
			return false;
		if(cliente.getEstado().isEmpty() || cliente.getEstado() == null)
			return false;
		if(cliente.getNumero().isEmpty() || cliente.getNumero() == null)
			return false;
		if(cliente.getCep().isEmpty() || cliente.getCep() == null)
			return false;
		
		if(cliente.getSenha().equals(cliente.getSenhaConfirma())) {
			if(cliente.getCpf().matches("[0-9]*")) {
				if(!cliente.getNome().matches("[0-9]*")) {
					return true;
				}
			}
		} 
		return false;
	}
}
