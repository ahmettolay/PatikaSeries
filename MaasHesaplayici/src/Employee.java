public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;


    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;


    }

    int tax() {
        double tax1 = 0;
        if (this.salary < 1000) {
            return (int) tax1;
        }

        if (this.salary >= 1000) {
            return (int) (tax1 = this.salary * 0.03);
        }
        System.out.println(tax1);
        return (int) tax1;


    }

    int bonus() {
        int mesai = 0;
        if (workHours <= 40) {
            return  mesai;
        }
        if (workHours > 40) {

            mesai = (int) (workHours - 40);
            int bonus1 = mesai * 30;

            return bonus1 ;
        }
        int bonus1 = mesai * 30;
        System.out.println(bonus1);
        return bonus1;
    }

    int riseSalary() {
        double riseSalary = 0;
        if (2021 - this.hireYear < 10) {
            return (int) (riseSalary = this.salary * 0.05);
        }
        if (2021 - this.hireYear < 20 && 2021 - this.hireYear > 9) {

            return (int) (riseSalary = this.salary * 0.1);
        }
        if (2021 - this.hireYear >= 20) {
            return (int) (riseSalary = this.salary * 0.15);
        }
        System.out.println(riseSalary);
        return (int) riseSalary;
    }


    void toSSS() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalımşa Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + riseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş : "+(bonus()+this.salary-tax()));
        System.out.println("Toplam Maaş : "+(this.salary+riseSalary()));
    }
}
