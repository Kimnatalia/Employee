public class Mainemployee{
    public static void main(String[]args){


 Specialist specialist1 = new Specialist();
        specialist1.setFio("Kan Alexsey");
        specialist1.setAge(35);
        specialist1.setSalary(5000);
        specialist1.setLevels(1);
        specialist1.workWithClients();
        specialist1. print();
Specialist specialist2 = new Specialist();
        specialist2.setFio("Stvokov Sergey Ivanovich");
        specialist2.setAge(22);
        specialist2.setSalary(10000);
        specialist2.setLevels(2);
        specialist2.workWithClients();
        specialist2. print();
Specialist specialist3 = new Specialist();
        specialist3.setFio("Tolgonay kyzy Cooronbay");
        specialist3.setAge(25);
        specialist3.setSalary(5000);
        specialist3.setLevels(3);
        specialist3.workWithClients();
        specialist3. print();
Developer developer1 = new Developer();
        developer1.setFio("Sorokin Gleb");
        developer1.setAge(35);
        developer1.setSalary(5000);
        developer1.setGrades("Middle");
        developer1.writeCode();
        developer1. print();
Developer developer2 = new Developer();
        developer2.setFio("Smit Samanta");
        developer2.setAge(30);
        developer2.setSalary(5000);
        developer2.setGrades("Middle");
        developer2.writeCode();
        developer2. print();
Developer developer3 = new Developer();
        developer3.setFio("Anastacya Barsovna");
        developer3.setAge(31);
        developer3.setSalary(5000);
        developer3.setGrades("Middle");
        developer3.writeCode();
        developer3. print();
Developer developer4 = new Developer();
        developer4.setFio("Pushkova Larisa Viktorovna");
        developer4.setAge(28);
        developer4.setSalary(5000);
        developer4.setGrades("Middle");
        developer4.writeCode();
        developer4. print();

Manager manager1 = new Manager ();
    manager1.setFio("Bochkin Sergey Ivanovich");
    manager1.setAge(40);
    manager1.setSalary(5000);
    manager1.setHasStocks(true);
    manager1.writeProcedures();
    manager1. print();

Manager manager2 = new Manager ();
        manager2.setFio("Cooronbaev Altynbek");
        manager2.setAge(55);
        manager2.setSalary(5000);
        manager2.setHasStocks(true);
        manager2.writeProcedures();
        manager2. print();


CEO ceo = new CEO ();
    ceo.setFio("Cooronbaev Altynbek");
    ceo.setAge(55);
    ceo.setSalary(10000);
    ceo.setHasStocks(true);
    ceo.goPublic();
    ceo. print();


}

}
