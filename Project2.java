// Author: Tim Pasquel
// Major: Information Technology
// Creation Date: Feb 20 2024
// Due Date: Feb 28 2024
// Course: CSC243 - 10
// Prefessor: Professor DeMarco
// Assignment Number: Program 2
// Filename: BudgetTP.java 
// Purpose: Figure out yearly expenses, an attribute can only be changed once
// and after that, that value will be copied to the remaining of the year 

// Import the required libraries
import java.util.Scanner;
import java.util.Formatter;
import java.util.Arrays;
import java.util.*;

public class BudgetTP {

//
// Function Name: getIncome
//
// Description: Asks the user for their income for the month
//
// Parameters: double[] Income - Income for each month, int count - the current month in the loop
//                              boolean[] isChanged - Determines if the variable has been changed before
//
// Return Value: void
//
public static void  getIncome(double[] Income, boolean[] isChanged, int count) {
        Scanner in = new Scanner(System.in);
        double value = 0;
        int count_copy = count;

        do {
                System.out.println("Please Enter Your Income (Must be Postive): ");
                value = in.nextDouble();
        }
        while(value < 0);

        if(count == 0) {
                Income[count] = value;
        }

        else {
                if(value != Income[count-1]) {
                        Income[count] = value;
                        //while(count < 12) {
                        //      Income[count] = value;
                        //      count++;
                        //}
                        isChanged[0] = true;
                        count = count_copy;
                }
                else {
                        Income[count] = value;
                }
        }

}

//
// Function Name: getRent
//
// Description: Asks the user for their rent for the month
//
// Parameters: double[] Rent - Rent for each month, int count - the current month in the loop
//                              boolean[] isChanged - Determines if the variable has been changed before
//
// Return Value: void
//
public static void  getRent(double[] Rent, boolean[] isChanged,  int count) {
        Scanner in = new Scanner(System.in);
        double value = 0;
        int count_copy = count;

        do {
                System.out.println("Please Enter Your Monthly Rent (Must be Postive): ");
                value = in.nextDouble();
        }
        while(value < 0);

        if(count == 0) {
                Rent[count] = value;
        }

        else {
                if(value != Rent[count-1]) {
                        Rent[count] = value;
                        //while(count < 12) {
                        //      Rent[count] = value;
                        //      count++;
                        //}
                        isChanged[1] = true;
                        count = count_copy;
                }
                else {
                        Rent[count] = value;
                }
        }

}

//
// Function Name: getCar
//
// Description: Asks the user for their monthly car payment
//
// Parameters: double[] Car - Car payment for each month, int count - the current month in the loop
//                              boolean[] isChanged - Determines if the variable has been changed before
//
// Return Value: void
//
public static void  getCar(double[] Car, boolean[] isChanged, int count) {
        Scanner in = new Scanner(System.in);
        double value = 0;
        int count_copy = count;

        do {
                System.out.println("Please Enter Your Monthly Car Payment (Must be Postive): ");
                value = in.nextDouble();
        }
        while(value < 0);

        if(count == 0) {
                Car[count] = value;
        }

        else {
                if(value != Car[count-1]) {
                        Car[count] = value;
                        //while(count < 12) {
                        //      Car[count] = value;
                        //      count++;
                        //}
                        isChanged[2] = true;
                        count = count_copy;
                }
                else {
                        Car[count] = value;
                }
        }

}

//
// Function Name: getGas
//
// Description: Asks the user for their gas bill for the month
//
// Parameters: double[] Gas - Gas bill for each month, int count - the current month in the loop
//                              boolean[] isChanged - Determines if the variable has been changed before
//
// Return Value: void
//
public static void  getGas(double[] Gas, boolean[] isChanged, int count) {
        Scanner in = new Scanner(System.in);
        double value = 0;
        int count_copy = count;

        do {
                System.out.println("Please Enter Your Gas Bill (Must be Postive): ");
                value = in.nextDouble();
        }
        while(value < 0);

        if(count == 0) {
                Gas[count] = value;
        }

        else {
                if(value != Gas[count-1]) {
                        Gas[count] = value;
                        //while(count < 12) {
                        //      Gas[count] = value;
                        //      count++;
                        //}
                        isChanged[3] = true;
                        count = count_copy;
                }
                else {
                        Gas[count] = value;
                }
        }

}

//
// Function Name: getFood
//
// Description: Asks the user for their food bill for the month
//
// Parameters: double[] Food - Food bill for each month, int count - the current month in the loop
//                              boolean[] isChanged - Determines if the variable has been changed before
//
// Return Value: void
//
public static void  getFood(double[] Food, boolean[] isChanged, int count) {
        Scanner in = new Scanner(System.in);
        double value = 0;
        int count_copy = count;

        do {
                System.out.println("Please Enter Your Food Bill (Must be Postive): ");
                value = in.nextDouble();
        }
        while(value < 0);

        if(count == 0) {
                Food[count] = value;
        }

        else {
                if(value != Food[count-1]) {
                        Food[count] = value;
                        //while(count < 12) {
                        //      Food[count] = value;
                        //      count++;
                        //}
                        isChanged[4] = true;
                        count = count_copy;
                }
                else {
                        Food[count] = value;
                }
        }


}

//
// Function Name: getSavings
//
// Description: Asks the user how much they want in savings for the month
//
// Parameters: double[] Savings - Amount saved in the month, int count - the current month in the loop
//                              boolean[] isChanged - Determines if the variable has been changed before
//
// Return Value: void
//
public static void  getSavings(double[] Savings, boolean[] isChanged, int count) {
        Scanner in = new Scanner(System.in);
        double value = 0;
        int count_copy = count;

        do {
                System.out.println("Please Enter the Percentage You Want to Save (Must be Postive): ");
                value = in.nextDouble();
        }
        while(value < 0);

        if(count == 0) {
                Savings[count] = value;
        }

        else {
                if(value != Savings[count-1]) {
                        Savings[count] = value;
                        isChanged[5] = true;
                        count = count_copy;
                }
                else {
                        Savings[count] = value;
                }
        }

}

//
// Function Name: getFun
//
// Description: Asks the user how much they will spend on fun for the month
//
// Parameters: double[] Fun - Fun bill for each month, int count - the current month in the loop
//                              boolean[] isChanged - Determines if the variable has been changed before
//
// Return Value: void
//
public static void  getFun(double[] Fun, boolean[] isChanged, int count) {
        Scanner in = new Scanner(System.in);
        double value = 0;
        int count_copy = count;

        do {
                System.out.println("Please Enter the Percentage You Would Like to Save for Fun (Must be Postive): ");
                value = in.nextDouble();
        }
        while(value < 0);

        if(count == 0) {
                Fun[count] = value;
        }

        else {
                if(value != Fun[count-1]) {
                        Fun[count] = value;
                        isChanged[5] = true;
                        count = count_copy;
                }
                else {
                        Fun[count] = value;
                }
        }

}

//
// Function Name: main
//
// Description: Runs all of the nessessary functions to figure out the money
// saved for retirement
//
// Parameters: None
//
// Return Value: None
//
public static void main(String[] args) {

        // Define variables and objects
        Scanner in = new Scanner(System.in);

        int choice = 0;
        int count = 0;
        double disposable = 0;
        boolean flag = false;
        double curFun = 0;
        double curSave = 0;

        String[] Months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                 "Aug", "Sep", "Oct", "Nov", "Dec"};
        double[] Income = new double[12];
        double[] Rent = new double[12];
        double[] Car = new double[12];
        double[] Gas = new double[12];
        double[] Food = new double[12];
        double[] Savings = new double[12];
        double[] Fun = new double[12];
        double[] Total = new double[12];
        //Only 6 because savings and fun should only be changed once
        boolean[] isChanged = new boolean[]{false, false, false, false, false, false};
        boolean[] Changed = new boolean[]{false, false, false, false, false, false};

        //Loop through all of the months 
        while(count < 12) {

                if(isChanged[0] == true && isChanged[1] == true && isChanged[2] == true && isChanged[3] == true && isChanged[4] == true && isChanged[5] == true) {
                }
                else {
                System.out.println("Please Note That You Can Only Change Your Budget For Something Once A Year");
                System.out.println("Please Enter Your Budget for " + Months[count]);
                }

                //Get the budget values
                if(isChanged[0] == false) {
                        getIncome(Income, isChanged, count);
                        if(isChanged[0] == true) {
                                Changed[0] = true;
                        }
                }
                else {
                        Income[count] = Income[count-1];
                }

                if(isChanged[1] == false) {
                        getRent(Rent, isChanged, count);
                        if(isChanged[1] == true) {
                                Changed[1] = true;
                        }
                }
                else {
                        Rent[count] = Rent[count-1];
                }

                if(isChanged[2] == false) {
                        getCar(Car, isChanged, count);
                        if(isChanged[2] == true) {
                                Changed[2] = true;
                        }
                }
                else {
                        Car[count] = Car[count-1];
                }

                if(isChanged[3] == false) {
                        getGas(Gas, isChanged, count);
                        if(isChanged[3] == true) {
                                Changed[3] = true;
                        }
                }
                else {
                        Gas[count] = Gas[count-1];
                }

                if(isChanged[4] == false) {
                        getFood(Food, isChanged, count);
                        if(isChanged[4] == true) {
                                Changed[4] = true;
                        }
                }
                else {
                        Food[count] = Food[count-1];
                }

                disposable = Income[count] - (Rent[count] + Car[count] + Gas[count] + Food[count]);
                disposable = Math.abs(disposable);

                if(isChanged[5] == true) {
                        Savings[count] = curSave;
                        Fun[count] = curFun;
                        //Savings[count] = Savings[count-1];
                        //Fun[count] = Fun[count-1];

                        //Format Fun and Savings into dollars
                        Fun[count] = disposable * (Fun[count] / 100);
                        Savings[count] = disposable * (Savings[count] / 100);
                }

                //Loop to ensure disposible is equal to 100
                do{
                        if(isChanged[5] == false) {
                                getSavings(Savings, isChanged, count);
                                getFun(Fun, isChanged, count);
                                if(isChanged[5] == true) {
                                        Changed[5] = true;
                                }

                                curSave = Savings[count];
                                curFun = Fun[count];

                                //Format Fun and Savings into dollars
                                Fun[count] = disposable * (Fun[count] / 100);
                                Savings[count] = disposable * (Savings[count] / 100);
                        }
                        else {
                                break;
                        }
                        if((curSave + curFun) > 100 || (curSave + curFun) < 100) {
                        //if((Fun[count] + Savings[count]) > 100 || (Fun[count] + Savings[count]) < 100) {
                                System.out.println("The Percentages You Entered Do not Add Up to 100%, Please Enter Again");  
                        }
                }
           while((curSave + curFun) > 100 || (curSave + curFun) < 100);
           //while((Fun[count] + Savings[count]) > 100 || (Fun[count] + Savings[count]) < 100);

                //if(isChanged[5] == true) {
                //      int temp_count = count;
                //      double tempSavings = Savings[count];
                //      double tempFun = Fun[count];
                //      while(temp_count < 12) {
                //              Savings[temp_count] = tempSavings;
                //              Fun[temp_count] = tempFun;
                //              temp_count = temp_count + 1;
                //      }
                //}


                //Create the Total
                Total[count] = Rent[count] + Car[count] + Gas[count] + Food[count] + Fun[count] + Savings[count];
                // If everything is changed, fill out the rest of the total

                //if(isChanged[0] == true && isChanged[1] == true && isChanged[2] == true && isChanged[3] == true && isChanged[4] == true && isChanged[5] == true) {
                        //int temp_count = count;
                        //double temp_total = Total[count-1];
                        //while(temp_count < 12) {
                        //      Total[temp_count] = temp_total;
                //      Total[count] = Total[count-1];



                                //temp_count = temp_count + 1;
                        //}
                        //break;
                //}

                //Check to see if the Total is greater than the income, if so repeat the month
                if(Total[count] > Income[count]) {
                        System.out.println("Your Expenses Outweigh Your Income, Please Enter a New Monthly Budget:");
                        if(Changed[0] == true) {
                                Changed[0] = false;
                                isChanged[0] = false;
                        }
                        if(Changed[1] == true) {
                                Changed[1] = false;
                                isChanged[1] = false;
                        }
                        if(Changed[2] == true) {
                                Changed[2] = false;
                                isChanged[2] = false;
                        }
                        if(Changed[3] == true) {
                                Changed[3] = false;
                                isChanged[3] = false;
                        }
                        if(Changed[4] == true) {
                                Changed[4] = false;
                                isChanged[4] = false;
                        }
                        if(Changed[5] == true) {
                                Changed[5] = false;
                                isChanged[5] = false;
                        }
                        continue;
                }
                //Otherwise go to the next month
                else {
                        count++;
                }

        } //end of while

        // Output the data nicely
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.printf("%-10s ", "Month - ");
        for(String k:Months) System.out.printf("%-8s ", k);
        System.out.println();


        System.out.printf("%-10s ", "Income - ");
        for(double k:Income) System.out.printf("%-8.0f ", k);
        System.out.println();

        System.out.printf("%-10s ", "Rent - ");
        for(double k:Rent) System.out.printf("%-8.0f ", k);
        System.out.println();

        System.out.printf("%-10s ", "Car - ");
        for(double k:Car) System.out.printf("%-8.0f ", k);
        System.out.println();

        System.out.printf("%-10s ", "Gas - ");
        for(double k:Gas) System.out.printf("%-8.0f ", k);
        System.out.println();

        System.out.printf("%-10s ", "Food - ");
        for(double k:Food) System.out.printf("%-8.0f ", k);
        System.out.println();

        System.out.printf("%-10s ", "Savings - ");
        for(double k:Savings) System.out.printf("%-8.0f ", k);
        System.out.println();

        System.out.printf("%-10s ", "Fun - ");
        for(double k:Fun) System.out.printf("%-8.0f ", k);
        System.out.println();

        System.out.printf("%-10s ", "Total - ");
        for(double k:Total) System.out.printf("%-8.0f ", k);
        System.out.println();

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Goodbye...");
        System.out.println("--------------------------------------------------------------------------------------");

        } // End Main

} // End Class
