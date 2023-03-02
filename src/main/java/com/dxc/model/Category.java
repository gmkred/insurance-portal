package com.dxc.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Category {
	@Id
	private Long id;

	@Column(name="category_name_col")
	private String name;
	

	private Set<Policy> policies;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Policy> getPolicies() {
		return policies;
	}


	public void setPolicies(Set<Policy> policies) {
		this.policies = policies;
	}
	
	
	
}