package br.com.projetoagencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoagencia.model.Cliente;
import br.com.projetoagencia.repository.ClienteRepository;
import br.com.projetoagencia.service.ClienteService;

@Controller
@RequestMapping("/")
public class PacoteController {

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("pacote")
	public String getPacote() {
		return "/pacotes";
	}
	
	@GetMapping("pacoteMadrid")
	public String getPacoteMatrid() {
		return "/pacotes-2";
	}
	
	@GetMapping("pacoteLogado")
	public String home(ModelMap model) {
		Cliente cliente = clienteRepository.findByNome(IndexController.getCliDTO().getNome());

		model.addAttribute("nomeCliente", cliente.getNome());
		return "/areaLogada/pacotesLogado";
	}
	
	@GetMapping("pacoteLogadoMadrid")
	public String getPacoteLogadoMatrid(ModelMap model) {
		Cliente cliente = clienteRepository.findByNome(IndexController.getCliDTO().getNome());

		model.addAttribute("nomeCliente", cliente.getNome());
		return "/areaLogada/pacotes-2";
	}
	
}
