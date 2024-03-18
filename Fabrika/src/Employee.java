public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;


    Employee(String name, int salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    public void tax() {
    int tax;
    tax = (int) (this.salary * 0.03);
    this.salary = (this.salary - tax);

    }

    public void isSalary() {

        if (this.salary > 1000) {
            tax();
        }

    }

    public void bonus() {

        if (this.workHours>40) {
            int bonus;
            this.workHours = (this.workHours - 40);
            bonus = (this.workHours * 30);

        }

    }

    public void raiseSalary() {
        int year;

        year = this.hireYear - 2021;

        if (year < 10) {

            int money;
            money = (int) (this.salary * 0.03);
            this.salary = this.salary + money;

        }

        if ((year > 9) && (year <20)) {

            int money;
            money = (int) (this.salary * 0.1);
            this.salary = this.salary + money;

        }

        if (year > 19) {
            int money;
            money = (int) (this.salary * 0.15);
            this.salary = this.salary + money;
        }

    }

    public void toStr() {

        System.out.println("//**////**////**////**////**////**////**////**////**//");
        System.out.println("Çalışan: " + this.name);
        System.out.println("Maaş: " + this.salary);
        System.out.println("Haftalık çalışma saati: " + this.workHours);
        System.out.println("İşe başlangıç yılı: " + this.hireYear);

    }





}
