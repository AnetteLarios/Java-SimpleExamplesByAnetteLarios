package ArithmeticExercises1;
import ArithmeticExercises1.MathUtils.MathUtils;
import ArithmeticExercises1.models.BudgetEmployee;

import java.util.Scanner;
/*
This is a simple program example of how to use arithmetic operators in Java.
The program has a model called 'BudgetEmployee' that contains four attributes: salaryJanuary,
salaryFebruary, taxJanuary, and TaxFebruary. With these attributes the program is going to make different
arithmetic operations.

@author Anette Larios
@since 14.06.2023
@version 1.8.0
 */
public class ArithmeticsExercises1AppMain {

    public static void main (String [] args){
        //Creating a ButgetEmployee object called operations to access the attributes.
        BudgetEmployee operations = new BudgetEmployee();
        //Creating a scanner object
        Scanner scanner= new Scanner(System.in);
        /*
        Asking for values to be inserted by the user.
         */
        System.out.println("Please enter the  Salary of January");
        operations.salaryJanuary = scanner.nextInt();
        System.out.println("Please enter the Salary of February");
        operations.salaryFebruary = scanner.nextInt();
        System.out.println("Please enter the tax of January");
        operations.taxJanuary = scanner.nextDouble();
        System.out.println("Please enter the tax of February");
        operations.taxFebruary = scanner.nextDouble();

        //Calling to calculateOperations function sending as parameter the values inserted by the user.
        calculateOperations(operations.salaryJanuary, operations.salaryFebruary,
                operations.taxJanuary, operations.taxFebruary);

    }
    /*
    calculateOperations function calls a variety of other functions to do the arithmatic operations.
    @param salary January, salaryFebruary, taxJanuary, taxFebruary inserted by the user and provided by
    main function.

    @author Anette Larios
    @since 14.06.2023
     */
    public static void calculateOperations(int salaryJanuary, int salaryFebruary,
                                           double taxJanuary, double taxFebruary){

      /*
      Calling to functions that make the arithmetic operations  and assigning the return of the functions to
      variables
       */

        int accumulatedSalary = accumulatedSalary(salaryJanuary, salaryFebruary);
        double accumulatedTax = accumulatedTax(taxJanuary, taxFebruary);
        int earnings = earnings(salaryJanuary, salaryFebruary);
        float estimatedAnnualSalary = estimatedAnnualSalary(salaryJanuary, salaryFebruary);
        float distributedMoneyPerInhabitantJanuary = MathUtils.moneyAssignedForEachInhabitantPerMonth(salaryJanuary);
        float leftOverMoneyAfterDistributionJanuary = MathUtils.leftOverMoneyAfterDistribution(salaryJanuary);
        float distributedMoneyPerInhabitantFebruary = MathUtils.moneyAssignedForEachInhabitantPerMonth(salaryFebruary);
        float leftOverMoneyAfterDistributionFebruary = MathUtils.leftOverMoneyAfterDistribution(salaryFebruary);

      /*
      Calling to printCalculations functions, receives all variables that contains the arithmetics operations' results
       */
        printCalculations(accumulatedSalary,accumulatedTax,earnings,estimatedAnnualSalary,
                distributedMoneyPerInhabitantJanuary,leftOverMoneyAfterDistributionJanuary,
                distributedMoneyPerInhabitantFebruary,leftOverMoneyAfterDistributionFebruary);
    }

    /*
    accumulatedSalary adds the salary of the two received months
    @param salaryJanuary, salaryFebruary provided by calculateOperations function.
    @return is the result of the addition between salaryJanuary and salaryFebruary
    @author Anette Larios
    @since 14.06.2023
    */
    public static int accumulatedSalary(int salaryJanuary, int salaryFebruary){
        return salaryJanuary + salaryFebruary;
    }

    public static double accumulatedTax(double taxJanuary, double taxFebruary){
        return taxJanuary + taxFebruary;
    }

    public static int earnings(int salaryJanuary, int salaryFebruary){
        return salaryFebruary - salaryJanuary;
    }

    public static float estimatedAnnualSalary(int salaryJanuary, int salaryFebruary){
        float averagePerMonth = ( (float) salaryJanuary + (float) salaryFebruary) / 2 ;
        return averagePerMonth * 12;
    }

    public static void printCalculations(int accumulatedSalary, double accumulatedTax, int earnings,
                                         float estimatedAnnualSalary, float distributedMoneyPerInhabitantJanuary,
                                         float leftOverMoneyAfterDistributionJanuary,
                                         float distributedMoneyPerInhabitantFebruary,
                                         float leftOverMoneyAfterDistributionFebruary){
        String calculationsInformation = String.format("Showing results: \n" +
                        "Accumulated Salary: %d \n" +
                        "Accumulated Tax: %f \n" +
                        "Earnings: %d \n" +
                        "Estimated Annual Salary: %f \n" +
                        "Distributed Money Per Inhabitant January: %f \n" +
                        "Leftover money after January distribution: %f \n" +
                        "Distributed Money Per Inhabitant February: %f \n" +
                        "Leftover money after February distribution: %f \n",
                accumulatedSalary,
                accumulatedTax,
                earnings,
                estimatedAnnualSalary,
                distributedMoneyPerInhabitantJanuary,
                leftOverMoneyAfterDistributionJanuary,
                distributedMoneyPerInhabitantFebruary,
                leftOverMoneyAfterDistributionFebruary);

        System.out.println(calculationsInformation);
    }

}
