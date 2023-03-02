package com.dxc.dto;

public class CategoryDTO {

	private Long id;
	private String name;
	private Integer noOfPolicies;

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

	public Integer getNoOfPolicies() {
		return noOfPolicies;
	}

	public void setNoOfPolicies(Integer noOfPolicies) {
		this.noOfPolicies = noOfPolicies;
	}

	public CategoryDTO() {
	}

	public CategoryDTO(Long id, String name, Integer noOfPolicies) {
		super();
		this.id = id;
		this.name = name;
		this.noOfPolicies = noOfPolicies;
	}

}
