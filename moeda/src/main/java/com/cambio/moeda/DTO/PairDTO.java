package com.cambio.moeda.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PairDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String result;
	private String documentation;
	private String terms_of_use;
	private String base_code;
	private String target_code;
	private Double conversion_rate;
	

	private LocalDateTime data = LocalDateTime.now();
	
	
}
