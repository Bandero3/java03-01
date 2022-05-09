package lt.codeacademy.generic;

public class Main {
    public static void main(String[] args) {
        Mapas<DnsProvider, DnsServer> dnsMap = new Mapas<>();
        dnsMap.add(DnsProvider.GOOGLE, new DnsServer("127.0.0.1", "1.1.1.1"));
        dnsMap.add(DnsProvider.AWS, new DnsServer("32.88.7.12", "192.127.88.12"));

        DnsServer dnsServer = dnsMap.get(DnsProvider.AWS);
        System.out.println(dnsServer);

        Mapas<String, Integer> manoMapas = new Mapas<>();
        manoMapas.add("Vienas",1);
        manoMapas.add("Desimt",10);
        manoMapas.add("Simtas",100);

        Integer simtas = manoMapas.get("Simtas");
        System.out.println(simtas);
    }
}
