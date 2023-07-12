package br.com.projeto.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.projeto.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
