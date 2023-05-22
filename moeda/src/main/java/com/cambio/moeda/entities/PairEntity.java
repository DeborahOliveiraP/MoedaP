package com.cambio.moeda.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@Entity
@Table(name = "resultado_conversao")
@Builder
@AllArgsConstructor

public class PairEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Column(name = "moeade_base")
	private String base_code;
	@Column(name = "moda_conversao")
	private String target_code;
	@Column(name = "resultado")
	private Double conversion_rate;
	
	@Column(name = "acesso")
	private LocalDateTime data;
	

	
	public PairEntity() {};
	
	public PairEntity(String base_code, String target_code, Double conversion_rate, LocalDateTime data) {
		
		
		this.base_code = base_code;
		this.target_code = target_code;
		this.conversion_rate = conversion_rate;
		this.data = data; 
		
		
	}
	
}
