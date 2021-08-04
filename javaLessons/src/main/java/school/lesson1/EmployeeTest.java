package school.lesson1;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Alina Fattakhova", "dentist", "spiritusdentatus@gmail.com", "89534080108", 150, 34);
        employees[1] = new Employee("Zulfiya Aukhatshina", "orthodontist", "zulya555@mail.ru", "87635245674", 150, 36);
        employees[2] = new Employee("Ramil Bagoviev", "surgeon", "ramil555@mail.ru", "89576453213", 130, 41);
        employees[3] = new Employee("Rais Khafizov", "surgeon", "rais555@mail.ru", "89764563876", 140, 56);
        employees[4] = new Employee("Azat Gazimzyanov", "therapist", "azat555@gmail.com", "98747653476", 120, 28);


        for (Employee employee : employees) {
            if (employee.getAge() > 40)
                employee.info();

        }
    }

}

class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
