public class NetworkTrafficController {

    public void blockPort(int port) {
        System.out.println("NetworkTrafficController: Blocking port " + port);
    }

    public void unblockPort(int port) {
        System.out.println("NetworkTrafficController: Unblocking port " + port);
    }

    public void divertTraffic() {
        System.out.println("NetworkTrafficController: Diverting traffic to honeypot");
    }

    public void monitorPacketLoss() {
        System.out.println("NetworkTrafficController: Monitoring packet loss");
    }
}
