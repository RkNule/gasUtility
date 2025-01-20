package com.example.gasuutility.dto;

import lombok.Data;

@Data
public class ServiceRequestDTO {

    private String name;
    private String requestType;
    private String description;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
