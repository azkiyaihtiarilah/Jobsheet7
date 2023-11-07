import java.util.Scanner;

/**
 * ForMultiples08
 */
public class ForMultiples08 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int multiple;
        int sum = 0;
        int counter = 0;

        System.out.print("Input the multiple: ");
        multiple = input08.nextInt();

        for(int i=1;i<=50;i++){
            if(i % multiple == 0){
                sum = sum + i;
                counter++;
                //System.out.println(i+"-");
            }
        }

        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50. \n", counter , multiple);
        System.out.printf("The sum from all multiple of %d in range 1 s.d 50 %d. \n", multiple , sum);
    }
}