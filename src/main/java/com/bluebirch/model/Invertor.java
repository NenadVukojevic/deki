package com.bluebirch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invertor_type")
public class Invertor {

	@Id
	@Column(name="invertor_id")
	private Integer invertorId;

	@Column(name="invertor_name")
	private String invertorName;

	public Invertor() {
		super();
	}

	public Invertor(Integer invertorId, String invertorName) {
		super();
		this.invertorId = invertorId;
		this.invertorName = invertorName;
	}

	public Integer getInvertorId() {
		return invertorId;
	}

	public void setInvertorId(Integer invertorId) {
		this.invertorId = invertorId;
	}

	public String getInvertorName() {
		return invertorName;
	}

	public void setInvertorName(String invertorName) {
		this.invertorName = invertorName;
	}

	
}
