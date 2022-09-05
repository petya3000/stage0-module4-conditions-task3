package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000) {
                        System.out.println((double)salary * 0.85);
                    }
                    else if (10000 < salary && salary <= 20000) {
                        System.out.println((double)salary * 0.82);
                    }
                    else if (salary > 20000) {
                        System.out.println((double)salary * 0.8);
                    }
                    else if (salary < 0) {
                        System.out.println("wrong input!");
                    }
    }
}
