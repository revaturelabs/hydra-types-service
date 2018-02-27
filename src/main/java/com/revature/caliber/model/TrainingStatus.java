package com.revature.caliber.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TrainingStatus implements Serializable{
	@JsonProperty("Signed")
	Signed,
	@JsonProperty("Selected")
	Selected,
	@JsonProperty("Training")
	Training,
	@JsonProperty("Marketing")
	Marketing,
	@JsonProperty("Confirmed")
	Confirmed,
	@JsonProperty("Employed")
	Employed,
	@JsonProperty("Dropped")
	Dropped
}
