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

	private static ClienteDTO cliDTO;

	@GetMapping()
	public String getIndex() {
		return "/index";
	}

	public ClienteService getClienteService() {
		return new ClienteService(this.clienteRepository);
	}

	@GetMapping("sair")
	public String sair() {
		cliDTO = null;
		return "redirect:/ ";
	}

	public static ClienteDTO getCliDTO() {
		return cliDTO;
	}

	public static void setCliDTO(ClienteDTO cliDTO) {
		IndexController.cliDTO = cliDTO;
	}

}
