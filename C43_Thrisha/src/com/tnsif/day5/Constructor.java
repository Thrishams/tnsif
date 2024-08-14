package com.tnsif.day5;

public class Constructor {
		String name;
		int age;
		String dept;
		//default Constructor
		public Constructor() {
			System.out.println("Defualt Constructor");
		}
		//Parameterized Constructor
		//Use this keyword
	public Constructor(String ConstructorName, int ConstructorAge, String ConstructorDept) {
		System.out.println("Parameterized Constructor");
		this.name = ConstructorName;
		this.age = ConstructorAge;
		this.dept = ConstructorDept;
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
			Constructor obj = new Constructor();
			obj.setName("Thrisha");
			obj.setAge(20);
			obj.setDept("AI&DS");
			System.out.println(obj);
		}

}

