package com.enesk.ekSecurity.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class EkSecurityConfig {

	//Tablo ismi default users, authorities
/*	@Bean
	public UserDetailsManager userDetailsManager(DataSource dataSource) {
		return new JdbcUserDetailsManager(dataSource);
	}*/
	
	@Bean
	public UserDetailsManager userDetailsManager(DataSource dataSource) {
		JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
		jdbcUserDetailsManager.setUsersByUsernameQuery(" select username, password, enabled from users where username = ? ");
		jdbcUserDetailsManager.setAuthoritiesByUsernameQuery(" select username, authority from authorities where username = ? ");
		return jdbcUserDetailsManager;
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(configurer -> configurer
				.requestMatchers(HttpMethod.GET, "/api/envanters").hasRole("KISITLI")
				.requestMatchers(HttpMethod.GET, "/api/envanters/**").hasRole("OTHER")
				.requestMatchers(HttpMethod.POST, "/api/envanters").hasRole("YETKILI")
				.requestMatchers(HttpMethod.PUT, "/api/envanters").hasRole("YETKILI")
				.requestMatchers(HttpMethod.DELETE, "/api/envanters/**").hasRole("ADMIN"));

		http.httpBasic();
		http.csrf().disable();
		
		return http.build();

	}

}
