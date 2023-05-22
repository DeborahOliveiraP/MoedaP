package com.cambio.moeda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cambio.moeda.DTO.PairDTO;
import com.cambio.moeda.service.ColetarPaisImplement;

@RestController
@RequestMapping("/pesquisa")
public class ConversaoParesController {
	
	@Autowired
	private ColetarPaisImplement coletarDados;
	
	@GetMapping("{pais}")
	public ResponseEntity<PairDTO> ConsultaPaiSS(@PathVariable("pais")String pais){
		PairDTO pairDTO = coletarDados.ConsultaPaiSS(pais);
		return ResponseEntity.ok(pairDTO);
	}
	
}
