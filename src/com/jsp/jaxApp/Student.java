package com.jsp.jaxApp;

import javax.xml.bind.annotation.XmlAttribute;

public class Student 
{
private int id;
private String name;
private String qual;
@XmlAttribute
public int getId() {
	return id;
}
public void setId(int id) 
{
	this.id = id;
}
public String getName()
{
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getQual() {
	return qual;
}
public void setQual(String qual) {
	this.qual = qual;
}

}
