package br.com.projeto.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.dslist.dto.GameListDTO;
import br.com.projeto.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  @Autowired
  private GameListService gameListService;

  @GetMapping
  public List<GameListDTO> getAll() {
    return gameListService.findAll();
  }

}
