package tnsif.DAY3.OOPS;

public class Encapsulation {
String name;
int age;
String dept;
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
	@Override
	public String toString() {
		return "OopsConcept [Name=" +name +", Age= " +age+""+", Dept ="+dept+"]";
	}

public static void main(String[]args) {
	Encapsulation obj = new Encapsulation();
	obj.setName("Thrisha");
	obj.setAge(20);
	obj.setDept("AI&DS");
	System.out.println(obj.name);
}
}
