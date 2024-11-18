import java.text.DecimalFormat;

public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped < 5 ? 1 : 0.85d;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

   public double finalSalary(int daysSkipped, int productsSold) {
       double result = bonusForProductsSold(productsSold) + (salaryMultiplier(daysSkipped) * 1000.00);
       result = result <= 2000 ? result : 2000;
       return result;
    }

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println(salaryCalculator.salaryMultiplier(3));
        System.out.println(salaryCalculator.bonusMultiplier(5));
        System.out.println(salaryCalculator.bonusForProductsSold(5));
        System.out.println(salaryCalculator.finalSalary(2,90));
    }
}
