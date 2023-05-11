package com.enesk.ekSecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="authorities")
@Getter @Setter @NoArgsConstructor 
public class Authorities  {
	
	@Id
	private int authorityid;
	private String username;
	private String authority;

}
