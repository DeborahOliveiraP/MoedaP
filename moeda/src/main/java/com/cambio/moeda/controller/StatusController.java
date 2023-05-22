package com.cambio.moeda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cambio.moeda.DTO.CurrencyDTO;
import com.cambio.moeda.utils.Constantes;


@Service
@Controller
@RestController
@RequestMapping("/pesquisa")
public class StatusController {
	
	private String url_str = Constantes.BASE_URL;
	
	
	@GetMapping("/status")
	public CurrencyDTO consultaLogis() {
		RestTemplate restTemplate = new RestTemplate();
		CurrencyDTO resp = restTemplate.getForObject(url_str + "latest/USD", CurrencyDTO.class);

		return resp;
	}
}
