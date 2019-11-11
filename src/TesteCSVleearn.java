import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteCSVleearn {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("contas.csv"));

        while(sc.hasNextLine()){

            String linhascanner = sc.nextLine();

            Scanner linha = new Scanner(linhascanner);

            linha.useDelimiter(",");

            linha.useLocale(Locale.US);

            String accountType = linha.next();
            int number = linha.nextInt();
            int agency = linha.nextInt();
            String name = linha.next();
            double money = linha.nextDouble();

            System.out.format(new Locale("pt","BR"), "%s: %d%d ---- %s: R$%.2f %n", accountType, number, agency, name, money);

            linha.close();
        }

        sc.close();

    }
}
