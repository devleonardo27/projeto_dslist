package br.com.projeto.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.dslist.dto.GameDTO;
import br.com.projeto.dslist.dto.GameMinDTO;
import br.com.projeto.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameMinDTO> findAll() {
    return gameService.findAll();
  }

  @GetMapping(value = "/{id}")
  public GameDTO getById(@PathVariable Long id) {
    return gameService.findById(id);
  }

}
