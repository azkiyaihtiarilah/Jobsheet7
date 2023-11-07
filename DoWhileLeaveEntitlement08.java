import java.util.Scanner;

/**
 * DoWhileLeaveEntitlement08
 */
public class DoWhileLeaveEntitlement08 {

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.print("Jatah cuti: ");
        leaveEntitlement = input08.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
            confirmation = input08.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                numLeave = input08.nextInt();

                if (numLeave <= leaveEntitlement ) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Sisa jatah cuti: "+ leaveEntitlement);
                } else{
                    System.out.println("Sisa jatah cuti anda tidak mencukupi!");
                } 
            } else{
                break;
            }
        } while (leaveEntitlement > 0);
    }
}