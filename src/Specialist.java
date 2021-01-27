public class Specialist extends Employee {

   int levels;

   public Specialist(String fio, int age, int salary, int levels) {
      super(fio, age, salary);
      this.levels = levels;
   }

   public Specialist(int levels) {
      this.levels = levels;
   }

   public Specialist(){

   }

   public int getLevels() {
      return levels;
   }

   public void setLevels(int levels) {
      this.levels = levels;
   }

   public void print(){
      System.out.println("FIO:   " + this.fio + "."
              + "Age: " + this.age + "."
              + "Salary: " + this.salary
              + "Level is:   " + this.levels + ".");
   }

   public void  workWithClients() {
      System.out.println("What can i help you");
   }

}
