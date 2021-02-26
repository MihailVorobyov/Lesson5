public class Main {
	public static void main(String[] args) {

		//4. Создать массив из 5 сотрудников.

		Employee[] employees = new Employee[5];
		employees[0] = new Employee("Иванов Иван Иванович", "генеральный директор", "iii@company.ru", "+79998887766",
				150000, 41);
		employees[1] = new Employee("Иванов Степан Иванович", "главный бухгалтер", "isi@company.ru", "+79998887765",
				100000, 39);
		employees[2] = new Employee("Нечитайло Григорий Олегович", "системный администратор", "ngo@company.ru",
				"+79990101010",
				90000, 28);
		employees[3] = new Employee("Дятлова Алёна Николаевна", "старший программист", "dan@company.ru",
				"+79991231231",
				110000, 50);
		employees[4] = new Employee("Котов Павел Юрьевич", "водитель", "kpy@company.ru", "+79998887700",
				60000, 46);

		oldEmployees (employees);
	}

	//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

	public static void oldEmployees (Employee[] employeesList) {
		for (Employee emp : employeesList) {
			if (emp.getAge() > 40) {
				emp.printToConsole(emp);
			}
		}
	}
}
