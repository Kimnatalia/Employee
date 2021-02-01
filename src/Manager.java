public class Manager extends Employee {
    boolean hasStocks;

    public Manager() {

    }

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }

    public Manager(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public void print() {
        System.out.println("FIO:   " + this.fio + "."
                + "Age: " + this.age + "."
                + "Salary: " + this.salary + "."
                + "Stok is:   " + this.hasStocks + ".");
    }

    public void writeProcedures() {
        System.out.println("Writing procedure");
    }


    public void goToVacation() {
        System.out.println("I am going to Egipt!");
    }
}