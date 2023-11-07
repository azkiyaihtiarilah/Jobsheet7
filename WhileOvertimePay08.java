import java.util.Scanner;

/**
 * WhileOvertimePay08
 */
public class WhileOvertimePay08 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int overtimeHours;
        double totalOvertimePay = 0;
        double overtimePay = 0;
        String position;

        System.out.print("Employe number = ");
        int numEmployee = input08.nextInt();

        int i = 0 ;
        while(i<numEmployee){
            System.out.println("Position of Employee -director, manager, staff- ");
            System.out.print("enter the job title of the employee-"+ (i+1) + ": ");
            position = input08.next();
            System.out.print("Employee overtime hours = ");
            overtimeHours = input08.nextInt();
            i++;

            if(position.equalsIgnoreCase("director")){
                continue;
            } else if(position.equalsIgnoreCase("manager")){
                overtimePay = overtimeHours * 100000;
            } else if(position.equalsIgnoreCase("staff")){
                overtimePay = overtimeHours * 75000;
            } else{
                System.out.println("Position Invalid!");
                i--;
                continue;
            }

            totalOvertimePay += overtimePay;
            
        }

        System.out.print("Total of Overtime Pay = "+ totalOvertimePay);
    }
}