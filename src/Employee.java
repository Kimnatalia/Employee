import java.net.SocketTimeoutException;

public class Employee {

    String fio;
    int age;
    int salary;

    public Employee(String fio, int age, int salary) {
        this.fio = fio;
        this.age = age;
        this.salary = salary;
    }

    public Employee(){

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void print(){
        System.out.println("FIO:   " + this.fio + "."
                + "Age: " + this.age + "."
                + "Salary: " + this.salary + "." );
    }

}


