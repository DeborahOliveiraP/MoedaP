package com.cambio.moeda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cambio.moeda.DTO.PairDTO;
import com.cambio.moeda.entities.PairEntity;
import com.cambio.moeda.service.ColetarPais;
import com.cambio.moeda.service.ConversaoEmParService;

@RestController
@RequestMapping("/conversao")
public class ConversaoParesController {
	
	@Autowired
	private ColetarPais coletarDados;

	@Autowired
	private ConversaoEmParService pares;
	
	@GetMapping("{origem}/{destino}")
	public ResponseEntity<PairDTO> ConsultaPaiSS(@PathVariable String origem, @PathVariable String destino){
		PairDTO pairDTO = coletarDados.ConsultaPaiSS(origem, destino);
		return ResponseEntity.ok(pairDTO);
	}
	
	@GetMapping("/historico")
	public List<PairEntity> ConsultaHistórico(){
		List<PairEntity> pairDTO = pares.historico(); 
		return pairDTO;
	}
	
}
