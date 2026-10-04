import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Adapter setup
        LegacyFirewall oldFirewall = new LegacyFirewall();

        SecurityLog securityLog =
                new FirewallAdapter(oldFirewall);

        // Ask for security event
        System.out.print("Enter security event: ");
        String message = scanner.nextLine();

        System.out.print("Enter severity level: ");
        int severity = scanner.nextInt();

        scanner.nextLine();

        securityLog.logEvent(message);
        securityLog.setSeverity(severity);

        // Facade setup
        NetworkTrafficController network =
                new NetworkTrafficController();

        UserAccessManager users =
                new UserAccessManager();

        EncryptionService encryption =
                new EncryptionService();

        CommandCenterFacade commandCenter =
                new CommandCenterFacade(
                        network,
                        users,
                        encryption
                );

        System.out.println();
        System.out.println("Choose a security mode:");
        System.out.println("1. Lockdown");
        System.out.println("2. Lift Lockdown");
        System.out.println("3. Maintenance");

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {

            commandCenter.initiateEmergencyLockdown();

        } else if (choice == 2) {

            commandCenter.liftEmergencyLockdown();

        } else if (choice == 3) {

            commandCenter.enableMaintenanceMode();

        } else {

            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
