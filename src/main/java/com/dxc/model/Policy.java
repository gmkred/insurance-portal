package com.dxc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Policy {

	@Id
	private Long id;
	@Column(name = "policy_name")
	private String name;
	@Column(name = "policy_duration")
	private Double duration;
	@Column(name = "policy_coverageAmount")
	private Double coverageAmount;
	private Double monthlyPay;
	@ManyToOne
	@JoinColumn(name = "c_fk")
	private Category category;

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

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public Double getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(Double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	public Double getMonthlyPay() {
		return monthlyPay;
	}

	public void setMonthlyPay(Double monthlyPay) {
		this.monthlyPay = monthlyPay;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
