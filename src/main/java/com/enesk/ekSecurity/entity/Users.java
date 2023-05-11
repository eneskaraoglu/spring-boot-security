package com.enesk.ekSecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter @Setter @NoArgsConstructor 
public class Users  {
	
	@Id
	private int userid;
	private String username;
	private String password;
	private String enabled;

}
