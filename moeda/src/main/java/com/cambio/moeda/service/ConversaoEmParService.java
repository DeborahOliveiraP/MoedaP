package com.cambio.moeda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cambio.moeda.DTO.PairDTO;
import com.cambio.moeda.entities.PairEntity;
import com.cambio.moeda.repository.SalvarRepository;
import com.cambio.moeda.utils.Constantes;


@Service
public class ConversaoEmParService implements ColetarPais {

	private String url_str = Constantes.BASE_URL;
	
	
	
	@Autowired
	private SalvarRepository repository;
	
	@Override
	public PairDTO ConsultaPaiSS(String pais, String pais2) {
		RestTemplate restTemplate = new RestTemplate();
		PairDTO resp = restTemplate.getForObject(url_str +"pair/"+pais+"/"+ pais2, PairDTO.class);
		
		getPair(resp);
		return resp;
	}
	
	
	public void getPair(PairDTO pairDTO) {
		
		PairEntity pairEntity = PairEntity.builder()
				.base_code(pairDTO.getBase_code())
				.target_code(pairDTO.getTarget_code())
				.conversion_rate(pairDTO.getConversion_rate())
				.data(pairDTO.getData())
				.build();
		
		
                
		
		repository.save(pairEntity);
	
	}
	
	
	
	public List<PairEntity> historico(){
		return repository.findAll();
	}
}
