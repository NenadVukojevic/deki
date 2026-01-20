package com.bluebirch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="invertor_models")
public class InvertorModel {
	@Id
	@Column(name="model_id")
	private Integer modelId;

	@Column(name="invertor_id")
	private Integer invertorId;

	@Column(name="model_pover")
	private Integer modelPover;

	@Column(name="price")
	private Integer price;

	public InvertorModel() {
		super();
	}

	public InvertorModel(Integer modelId, Integer invertorId, Integer modelPover, Integer price) {
		super();
		this.modelId = modelId;
		this.invertorId = invertorId;
		this.modelPover = modelPover;
		this.price = price;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public Integer getInvertorId() {
		return invertorId;
	}

	public void setInvertorId(Integer invertorId) {
		this.invertorId = invertorId;
	}

	public Integer getModelPover() {
		return modelPover;
	}

	public void setModelPover(Integer modelPover) {
		this.modelPover = modelPover;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	

	
}
