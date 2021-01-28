package com.softserve.edu06;

public class Student {
	private String name;
	private int age;
	private String info;

	public Student(String name, int age, String info) {
		this.name = name;
		this.age = age;
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getInfo() {
		return info;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((info == null) ? 0 : info.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = true;
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		Student other = null;
		if (obj instanceof Student) {
			other = (Student) obj;
		}
		if ( (other == null) || (age != other.age) ) {
			return false;
		}
		//
		if ( (info == null) && (other.info != null)
				|| (info != null) && (other.info == null) 
				|| (name == null) && (other.name != null)
				|| (name != null) && (other.name == null) ) {
			return false;
		}
		if ( result && (info != null) ) {
			result = result && info.equals(other.info);
		}
		if ( result && (name != null) ) {
			result = result && name.equals(other.name);
		}
		return result;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", info=" + info + "]";
	}

}
