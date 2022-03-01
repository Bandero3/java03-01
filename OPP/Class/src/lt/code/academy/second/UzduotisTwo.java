package lt.code.academy.second;

public class UzduotisTwo {
    public static void main(String[] args) {
        spausdink("Anton", "Januškevič", "Java", 5);
        spausdink("Anton", "Januškevič", "Java");
    }
    public static void spausdink(String vardas, String pavarde, String kalba, int weekNumb){
        System.out.println("Aš, " + vardas + " " + pavarde + " tirkai išmoksiu programuoti " + kalba + " per " + weekNumb + " savaites");

    }
    public static void spausdink(String vardas, String pavarde, String kalba){
        System.out.println("Aš, " + vardas + " " + pavarde + " tirkai išmoksiu programuoti " + kalba);

    }
}
