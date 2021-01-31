public class CEO extends Manager{
    boolean hasCompanyCar;

    public CEO (){

    }


    public CEO(String fio, int age, int salary, boolean hasStocks, boolean hasCompanyCar) {
        super(fio, age, salary, hasStocks);
        this.hasCompanyCar = hasCompanyCar;
    }


    public boolean isHasCompanyCar() {
        return hasCompanyCar;
    }

    public void setHasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    public void goPublic(){
        System.out.println( "Do not disturb. CEO working on IPO !!!");
    }
    public void print(){
        System.out.println("FIO:   " + this.fio + "."
                + "Age: " + this.age + "."
                + "Salary: " + this.salary
                + "Stok is:   " + this.hasStocks + "."
                + "Has company car: " +this.hasCompanyCar + "." );

      }

    public void fraze() {
        System.out.println("Intelligence is the ability to avoid getting work done, but in a way that gets it done. ");
    }
}
