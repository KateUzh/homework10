public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovch";
        String lastName = "Ivanov";
        String fullName = String.join(" ", lastName, firstName, middleName);
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("\nЗадача 2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("\nЗадача 3");
        String fullName2 = "Иванов Семён Семёнович";
        String correctFullName = fullName2.replace('ё', 'е');
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + correctFullName);
    }
}