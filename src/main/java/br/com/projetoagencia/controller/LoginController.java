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

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("login")
	public String getLogin(Model model) {
		ClienteDTO cliDTO = new ClienteDTO();
		model.addAttribute("clienteDTO", cliDTO);
		return "/login";
	}

	@PostMapping("login")
	public String login(ClienteDTO clienteDTO, ModelMap model) {
		Cliente cli = clienteRepository.findByEmailAndSenha(clienteDTO.getEmail(), clienteDTO.getSenha());

		if (cli == null) {
			return "redirect:/login#bg";
		}

		clienteDTO.setNome(cli.getNome());
		IndexController.setCliDTO(clienteDTO);
		//this.cliDTO = clienteDTO;

		return "redirect:/home";
	}
	
}
