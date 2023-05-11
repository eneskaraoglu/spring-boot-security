package com.enesk.ekSecurity.entity;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="t_envanter")
@Getter @Setter @NoArgsConstructor 
public class Envanter  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int envanterId;
	private String envanterAdi;
	private String envanterKodu;
	private BigDecimal envanterMiktar;
	private BigDecimal kritikMiktar;
	private int katalogId;

}
