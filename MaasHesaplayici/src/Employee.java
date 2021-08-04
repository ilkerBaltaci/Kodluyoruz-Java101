public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 100) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }
    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int workYear = 2021 - this.hireYear;
        if (workYear < 0) {
            return 0;
        } else if (workYear >= 0 && workYear < 10) {
            return this.salary * 0.05;
        } else if (workYear > 9 && workYear < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    @Override
    public String toString() {
        double salaryWithTaxAndBonus = this.salary - tax() + bonus();
        double totalSalary = this.salary - tax() + bonus() + raiseSalary();

        return "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.workHours + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + salaryWithTaxAndBonus + "\n" +
                "Toplam Maaş : " + totalSalary;
    }
}
