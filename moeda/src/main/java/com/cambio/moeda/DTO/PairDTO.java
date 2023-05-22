package com.cambio.moeda.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class PairDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String result;
	private String documentation;
	private String terms_of_use;
	private String base_code;
	private String target_code;
	private Double conversion_rate;
	

	private LocalDateTime data = LocalDateTime.now();
	
	public PairDTO() {

	}

	public PairDTO(String result, String documentation, String terms_of_use, String base_code,String target_code,Double conversion_rate,
			LocalDateTime data) {
		super();
		this.result = result;
		this.documentation = documentation;
		this.terms_of_use = terms_of_use;
		this.base_code = base_code;
		this.target_code = target_code ;
		this.conversion_rate = conversion_rate; 
		this.data = data;
	}
	
	
	
}
