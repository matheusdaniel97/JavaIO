import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteIoCSV {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("contas.csv"));

        while(sc.hasNextLine())
        {
            String linha = sc.nextLine();

            Scanner linhaScanner = new Scanner(linha);

            linhaScanner.useLocale(Locale.US);

            linhaScanner.useDelimiter(",");

            String tipo = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt", "BR"),"%s %d %d %s %.2f %n", tipo, agencia, numero, titular, saldo);

        }


        sc.close();

    }

}
