import java.util.Scanner;

public class PersonerIHuset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvor mange er der i din hustand? ");
        int antalpersoner = scanner.nextInt();

        int sumAlder = 0;
        double sumVægt = 0;
        String alleNavne = "";

        for (int n = 1; n <= antalpersoner; n++) {
            scanner.nextInt();
            System.out.println("Skriv antal personer");
            String navn = scanner.nextLine();
            System.out.println("Skrive "+ navn + "s alder");
            int alder = scanner.nextInt();
            double vægt = scanner.nextDouble();
            if (n>1) alleNavne = alleNavne + ", ";
            alleNavne = alleNavne + navn;
            sumAlder = sumAlder + alder;
            sumVægt = sumVægt + vægt;
        }
        System.out.println("Statestik for "+ alleNavne);
        System.out.println("Gennemsnitlig alder "+ sumAlder/antalpersoner);
        System.out.println("Gennemsnitlig vægt "+ sumVægt/antalpersoner);
    }
}
