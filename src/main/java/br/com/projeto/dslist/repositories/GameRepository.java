package br.com.projeto.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
