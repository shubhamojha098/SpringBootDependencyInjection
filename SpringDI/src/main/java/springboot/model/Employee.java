package springboot.model;

public class Employee {
private String name;
private String post;
private String address;
public Employee(String name, String post, String address) {
	super();
	this.name = name;
	this.post = post;
	this.address = address;
}
public Employee() {}
public String show() {
	return String.format("Name=%s\nPost=%s\nAddress=%s", name,post,address);
}
}
