//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("// Task 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф.И.О сотрудника - " + fullName);
        System.out.println();
        System.out.println("// Task 2");

        String fullNameOfEmployee = "Ivanov Ivan Ivanovich";
        String reportFullName = fullNameOfEmployee.toUpperCase();

        System.out.println("Данные Ф.И.О сотрудника для заполнения отчета - " + reportFullName);
        System.out.println();
        System.out.println("// Task 3");

        String employeeFullName = "Иванов Семён Семёнович";
        String correctedFullName = employeeFullName.replace("ё", "e");

        System.out.println("Данные Ф.И.О сотрудника  - " + correctedFullName);
    }
}