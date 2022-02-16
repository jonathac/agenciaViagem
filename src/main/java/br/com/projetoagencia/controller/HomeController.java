package br.com.projetoagencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.projetoagencia.dto.ClienteDTO;
import br.com.projetoagencia.model.Cliente;
import br.com.projetoagencia.repository.ClienteRepository;

@Controller
@RequestMapping("/teste")
public class HomeController {

	@Autowired
	private ClienteRepository clienteRepository;

	private ClienteDTO cliDTO;

	
	@GetMapping()
	public String getHome(ModelMap model) {
        Cliente cliente = clienteRepository.findByNome(this.cliDTO.getNome());
		
		model.addAttribute("nomeCliente", cliente.getNome());
		//cliDTO.setNome(cliDTO.getNome());
		//cliDTO = cliDTO;
		
		return "/";
	}
}
