package com.javasampleapproach.springrest.mongodb.model;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="attributes")
public class synonyme {
	
	 @Id
String id;
String code;
String hierarchy_code;
String roles [];
String validations;
Boolean required = false;;
Boolean variant = false;;
String description_translations [];
String label;
String label_translations [];
String values;
String requirement_level;
String values_list;
String type;
String example;
String type_parameter;
String description;

public synonyme() {
	
}
public synonyme(String id, String code, String hierarchy_code, String[] roles, String validations, Boolean required,
		Boolean variant, String[] description_translations, String label, String[] label_translations, String values,
		String requirement_level, String values_list, String type, String example, String type_parameter,
		String description) {
	super();
	this.id = id;
	this.code = code;
	this.hierarchy_code = hierarchy_code;
	this.roles = roles;
	this.validations = validations;
	this.required = required;
	this.variant = variant;
	this.description_translations = description_translations;
	this.label = label;
	this.label_translations = label_translations;
	this.values = values;
	this.requirement_level = requirement_level;
	this.values_list = values_list;
	this.type = type;
	this.example = example;
	this.type_parameter = type_parameter;
	this.description = description;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getHierarchy_code() {
	return hierarchy_code;
}
public void setHierarchy_code(String hierarchy_code) {
	this.hierarchy_code = hierarchy_code;
}
public String[] getRoles() {
	return roles;
}
public void setRoles(String[] roles) {
	this.roles = roles;
}
public String getValidations() {
	return validations;
}
public void setValidations(String validations) {
	this.validations = validations;
}
public Boolean getRequired() {
	return required;
}
public void setRequired(Boolean required) {
	this.required = required;
}
public Boolean getVariant() {
	return variant;
}
public void setVariant(Boolean variant) {
	this.variant = variant;
}
public String[] getDescription_translations() {
	return description_translations;
}
public void setDescription_translations(String[] description_translations) {
	this.description_translations = description_translations;
}
public String getLabel() {
	return label;
}
public void setLabel(String label) {
	this.label = label;
}
public String[] getLabel_translations() {
	return label_translations;
}
public void setLabel_translations(String[] label_translations) {
	this.label_translations = label_translations;
}
public String getValues() {
	return values;
}
public void setValues(String values) {
	this.values = values;
}
public String getRequirement_level() {
	return requirement_level;
}
public void setRequirement_level(String requirement_level) {
	this.requirement_level = requirement_level;
}
public String getValues_list() {
	return values_list;
}
public void setValues_list(String values_list) {
	this.values_list = values_list;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getExample() {
	return example;
}
public void setExample(String example) {
	this.example = example;
}
public String getType_parameter() {
	return type_parameter;
}
public void setType_parameter(String type_parameter) {
	this.type_parameter = type_parameter;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "synonym [id=" + id + ", code=" + code + ", hierarchy_code=" + hierarchy_code + ", roles="
			+ Arrays.toString(roles) + ", validations=" + validations + ", required=" + required + ", variant="
			+ variant + ", description_translations=" + Arrays.toString(description_translations) + ", label=" + label
			+ ", label_translations=" + Arrays.toString(label_translations) + ", values=" + values
			+ ", requirement_level=" + requirement_level + ", values_list=" + values_list + ", type=" + type
			+ ", example=" + example + ", type_parameter=" + type_parameter + ", description=" + description + "]";
}


}
