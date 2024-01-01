package com.example.validatingforminput;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PersonForm {
	
	// @NotNull: Does not allow a null value, which is what Spring MVC generates if the entry is empty.
	// @Size(min=2, max=30):Allows names between 2 and 30 characters long.
	@NotNull
	@Size(min=2, max=30)
	private String name;

	//@Min(18): Does not allow the age to be less than 18.
	@NotNull
	@Min(18)
	private Integer age;
	
	// Getter Method for Name
	public String getName() {
		return this.name;
	}

	// Setter Method for Name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter Method for Age
	public Integer getAge() {
		return age;
	}
	
	// Setter Method for Age
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	public String toString() {
		return "Person(Name: " + this.name + ", Age: " + this.age + ")";
	}
}