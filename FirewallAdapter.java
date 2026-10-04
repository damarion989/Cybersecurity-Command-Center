public class FirewallAdapter implements SecurityLog {

    private LegacyFirewall legacyFirewall;

    public FirewallAdapter(LegacyFirewall legacyFirewall) {
        this.legacyFirewall = legacyFirewall;
    }

    @Override
    public void logEvent(String message) {
        legacyFirewall.recordActivity(message);
    }

    @Override
    public void setSeverity(int level) {
        legacyFirewall.setAlertLevel(level);
    }
}
