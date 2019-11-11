import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        //FileWriter fw = new FileWriter("tcc2.txt");

        //FileOutputStream arquivo = new FileOutputStream("tcc2.txt"); //Inserir o arquivo
        //Writer escrever = new OutputStreamWriter(arquivo); //Identifica os Bytes
        //BufferedWriter br = new BufferedWriter(escrever); //Deixa o arquivo legível

        BufferedWriter bw = new BufferedWriter(new FileWriter("tcc2.txt"));
        bw.write("Estou escrevendo meu TCC");
        bw.newLine();
        bw.write("Escrevi meu TCC");

        bw.close();

    }

}
