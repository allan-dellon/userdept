package com.devsuperior.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdept.entities.User;

//classe para utilização de consultas dos objetos;
//serve para consultar, deletar, atualizar... 
//Se fossse para departamento seria DepartmentRepository;
// outra classe, seria ClasseRepository e assim por diante;

public interface UserRepository extends JpaRepository<User, Long>{

}
