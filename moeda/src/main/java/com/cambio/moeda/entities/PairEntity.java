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
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name = "resultado_conversao")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PairEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	
	@Column(name = "moeda_base")
	private String base_code;
	@Column(name = "moeda_conversao")
	private String target_code;
	@Column(name = "resultado")
	private Double conversion_rate;
	
	@Column(name = "acesso")
	private LocalDateTime data;

	
}
