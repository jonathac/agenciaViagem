package br.com.projetoagencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoagencia.dto.ClienteDTO;
import br.com.projetoagencia.model.Cliente;
import br.com.projetoagencia.repository.ClienteRepository;
import br.com.projetoagencia.service.ClienteService;

@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ClienteService clienteService;
	
	private ClienteDTO cliDTO;

	@GetMapping()
	public String getIndex() {
		return "/index";
	}
	
	
	@GetMapping("cadastro")
	public String getCadastro(Model model) {
		Cliente cliente = new Cliente();

		model.addAttribute("cliente", cliente);
		return "cadastro";
	}

	@PostMapping("cadastrar")
	public String postCadastro(Cliente cliente) {
		ClienteService clienteSer = this.getClienteService();
		clienteSer.create(cliente);

		return "redirect:/login";
	}

	@GetMapping	("login")
	public String getLogin(Model model) {
		ClienteDTO cliDTO = new ClienteDTO();
		model.addAttribute("clienteDTO", cliDTO);
		return "login";
	}
	
	@PostMapping("login")
	public String login(ClienteDTO clienteDTO, ModelMap model) {
		Cliente cli = clienteRepository.findByEmailAndSenha(clienteDTO.getEmail(), clienteDTO.getSenha());

		if (cli == null) {
			return "redirect:/?loginInvalido";
		}

		clienteDTO.setNome(cli.getNome());
		this.cliDTO = clienteDTO;

		return "redirect:/home";
	}

	public ClienteService getClienteService() {
		return new ClienteService(this.clienteRepository);
	}
	
	@GetMapping("home")
	public String getHome(ModelMap model) {
        Cliente cliente = clienteRepository.findByNome(this.cliDTO.getNome());
		
		model.addAttribute("nomeCliente", cliente.getNome());
		
		return "/home";
	}
}
