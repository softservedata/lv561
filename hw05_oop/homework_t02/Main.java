package homework_t02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Employee[] employees = {new SalariedEmployee("John Smith", "00-32-32-323", new HourlyPaidWorker(42)), 
								new SalariedEmployee("Elisabeth King", "03-43-86-308", new HourlyPaidWorker(38)),
								new SalariedEmployee("Harold Bloomberg", "23-65-55-998", new FixedPaidWorker()),
								new ContractEmployee("Kate Brown", "45-33-23-23-323", new HourlyPaidWorker(49)),
								new ContractEmployee("James Scarlett", "54-32-32-454", new FixedPaidWorker())};
		
		List<Employee> empl = Arrays.asList(employees);		
		Collections.sort(empl, Employee.bySalary);
		
		double sum = 0, avg = 0;
		
		for(int i = 0; i < empl.size(); i++) {
			System.out.println(empl.get(i));
			sum += empl.get(i).getSalary();
			avg = sum / empl.size();
		}
				
		System.out.println("Average Monthly Salary = " + avg);		
	}
}

abstract class Employee{
	String employeeId;
	String name;
	double salary;
	
	Employee(String name, String employeeId){
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public double getSalary() {
		return salary;
	}
	
	static Comparator<Employee> bySalary = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			int salary1 = (int) o1.getSalary();
			int salary2 = (int) o2.getSalary();
			return salary2 - salary1;
		}
	};
	
}

interface Payable {	
	double calculatePay();
}

class SalariedEmployee extends Employee {
	String socialSecurityNumber;
	HourlyPaidWorker hourlyPaidWorker;
	FixedPaidWorker fixedPaidWorker;
	double salary;
	
	SalariedEmployee(String name, String employeeId, HourlyPaidWorker hourlyPaidWorker){
		super(name, employeeId);
		this.hourlyPaidWorker = hourlyPaidWorker;
		this.salary = HourlyPaidWorker.salary;
	}

	SalariedEmployee(String name, String employeeId, FixedPaidWorker fixedPaidWorker){
		super(name, employeeId);
		this.fixedPaidWorker = fixedPaidWorker;
		this.salary = FixedPaidWorker.salary;
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee [name=" + name + ", employeeId="
				+ employeeId + ", salary=" + salary + "]";
	}

	public double getSalary() {
		return salary;
	}
	
}

class ContractEmployee extends Employee {
	String federalTaxIdmember;
	HourlyPaidWorker hourlyPaidWorker;
	FixedPaidWorker fixedPaidWorker;
	double salary;
	

	ContractEmployee(String name, String employeeId, HourlyPaidWorker hourlyPaidWorker) {
		super(name, employeeId);
		this.hourlyPaidWorker = hourlyPaidWorker;
		this.salary = HourlyPaidWorker.salary;		
	}
	
	ContractEmployee(String name, String employeeId, FixedPaidWorker fixedPaidWorker){
		super(name, employeeId);
		this.fixedPaidWorker = fixedPaidWorker;
		this.salary = FixedPaidWorker.salary;
	}
	
	@Override
	public String toString() {
		return "SalariedEmployee [name=" + name + ", employeeId="
				+ employeeId + ", salary=" + salary + "]";
	}

	public double getSalary() {
		return salary;
	}
	
}

class HourlyPaidWorker implements Payable {
	final double PER_HOUR = 40.0;
	static double salary;
	int hours;
		
	HourlyPaidWorker(int hours){
		this.hours = hours;
		HourlyPaidWorker.salary = calculatePay();
	}

	@Override
	public double calculatePay() {
		return hours * PER_HOUR;
	}
}	

class FixedPaidWorker implements Payable {
	final double PER_MONTH = 5000.0;
	static double salary;
	
	FixedPaidWorker(){
		FixedPaidWorker.salary = calculatePay();
	}
	
	@Override
	public double calculatePay() {
		return PER_MONTH;
	}
	
}
