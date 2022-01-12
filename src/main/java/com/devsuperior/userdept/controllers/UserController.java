package com.devsuperior.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

//Classe que serve para responder às aquisições do usuário;

@RestController
@RequestMapping(value = "/users") // caminho da Web
public class UserController {

	@Autowired
	private UserRepository repository;

	// implementação do endPoint, que retorna as informações do banco de dados;

	// nesse caso, retorna uma lista de usuários que está no banco de dados;
	@GetMapping // verbo get do http;
	public List<User> findAll() {

		// manda pro banco de dados a consulta e retorna uma lista:
		List<User> result = repository.findAll();

		return result;
	}

	// retorna um usuario (por id)

	@GetMapping(value = "/{id}") // no http vai adicionar mais um caminho com o "/" - passando id por parâmetro
	/* anotation serve para casar com o id de cima */
	public User findById(@PathVariable Long id) {

		// manda pro banco de dados a consulta e retorna uma lista:
		return repository.findById(id).get(); // o .get() pega o objeto opcional que está dentro do Id

	}

	
	//requestybody signfica que é o corpo da aquisição
	@PostMapping
	public User insert(@RequestBody User user) {

		//manda pro banco de dados o insert e retorna uma referência pro objeto salvo;
		return repository.save(user);

	}

}
