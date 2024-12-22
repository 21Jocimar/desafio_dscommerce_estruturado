package com.devsuperior.dscommerce.config.customgrant;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

// customizando o grant_type (Body da requisição POST do "Login") (Não precisa alterar esta classe)
public class CustomUserAuthorities {

	private String username;
	private Collection<? extends GrantedAuthority> authorities;

	public CustomUserAuthorities(String username, Collection<? extends GrantedAuthority> authorities) {
		this.username = username;
		this.authorities = authorities;
	}

	public String getUsername() {
		return username;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
}
