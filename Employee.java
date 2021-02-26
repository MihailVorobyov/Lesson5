/*1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.*/

public class Employee {

	private String fullName;
	private String position;
	private String email;
	private String phoneNumber;
	private double salary;
	private int age;

	//2. Конструктор класса должен заполнять эти поля при создании объекта.

	public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
		this.fullName = fullName;
		this.position = position;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.age = age;
	}

	//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

	public void printToConsole (Employee em) {
		System.out.println("Информация об объекте: \n");
		System.out.println("ФИО: " + fullName);
		System.out.println("Должность: " + position);
		System.out.println("email: " + email);
		System.out.println("Телефон: " + phoneNumber);
		System.out.println("Зарплата: " + salary);
		System.out.println("Возраст: " + age);
		System.out.println();
	}

	public String getFullName() {
		return fullName;
	}

	public String getPosition() {
		return position;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}
}
