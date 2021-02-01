public class Developer extends Employee{
    String grades;


    public Developer(String fio, int age, int salary, String grades) {
        super(fio, age, salary);
        this.grades = grades;
    }

    public Developer(String grades) {
        this.grades = grades;
    }

    public Developer(){

    }


    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void print(){
        System.out.println("FIO:   " + this.fio + "."
                + "Age: " + this.age + "."
                + "Salary: " + this.salary
                + "Grades is:   " + this.grades + ".");
    }

    public void  writeCode() {
        System.out.println("I am working");
    }

    public void goToVacation() {
        System.out.println("I am going to bootcamp!");
    }
}
