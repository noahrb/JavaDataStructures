package jds.model;

public class Customer 
{
private String name;
private int age;
private double height;
private boolean isMale;
private boolean nameJeff;


public Customer(String name, int age, double height, boolean isMale, boolean nameJeff)
{
	this.name = name;
	this.age = age;
	this.height = height;
	this.isMale = isMale;
	this.nameJeff = nameJeff;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public double getHeight() {
	return height;
}


public void setHeight(double height) {
	this.height = height;
}


public boolean isMale() {
	return isMale;
}


public void setMale(boolean isMale) {
	this.isMale = isMale;
}


public boolean isNameJeff() {
	return nameJeff;
}


public void setNameJeff(boolean nameJeff) {
	this.nameJeff = nameJeff;
}

}