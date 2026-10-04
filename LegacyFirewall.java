public class LegacyFirewall {

    public void recordActivity(String msg) {
        System.out.println("LegacyFirewall: Recording activity - " + msg);
    }

    public void setAlertLevel(int level) {
        System.out.println("LegacyFirewall: Alert level set to " + level);
    }
}
