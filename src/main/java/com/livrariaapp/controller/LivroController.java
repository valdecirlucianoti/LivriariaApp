package com.livrariaapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LivroController {
	@RequestMapping("/Adventure_of_Walter_and_the_Rabbits")
	public String walter() {
		return "livro/Adventure_of_Walter_and_the_Rabbits";
	}
}
