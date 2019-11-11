import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrint {

    public static void main(String[] args) throws IOException {

        //FileWriter fw = new FileWriter("tcc2.txt");

        //FileOutputStream arquivo = new FileOutputStream("tcc2.txt"); //Inserir o arquivo
        //Writer escrever = new OutputStreamWriter(arquivo); //Identifica os Bytes
        //BufferedWriter br = new BufferedWriter(escrever); //Deixa o arquivo legível

        PrintStream ps = new PrintStream("tcc3.txt");
        ps.println("Estou escrevendo meu TCC");
        ps.println();
        ps.println("Escrevi meu TCC3");

        ps.close();

    }

}
