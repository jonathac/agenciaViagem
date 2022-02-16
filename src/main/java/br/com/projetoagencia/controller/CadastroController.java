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
		if(cliente.getSenha().equals(cliente.getSenhaConfirma())){
			ClienteService clienteSer = this.getClienteService();
			//clienteService = getClienteService();
			clienteSer.create(cliente);
			return "redirect:/login";
		} else {
			return "redirect:/cadastro?senhainvalida";
		}
		
	}
	
	public ClienteService getClienteService() {
		return new ClienteService(this.clienteRepository);
	}
	
}
