package guru.springramework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springramework.services.ChuckNorrrisService;

@Controller
public class JokeController {

	private final ChuckNorrrisService chuckNorrrisService;

	public JokeController(ChuckNorrrisService chuckNorrrisService) {
		this.chuckNorrrisService = chuckNorrrisService;
	}
	
	@GetMapping({"/",""})
	public String getJoke(Model model) {
		model.addAttribute("joke", chuckNorrrisService.getJoke());
		return "index";
	}
	
	
}
