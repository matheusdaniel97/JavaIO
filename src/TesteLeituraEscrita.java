import java.io.*;

public class TesteLeituraEscrita {

    public static void main(String[] args) throws IOException {

        InputStream arquivoleitura = System.in; //Inserir o arquivo
        InputStreamReader leitor = new InputStreamReader(arquivoleitura); //Identifica os Bytes
        BufferedReader br = new BufferedReader(leitor); //Deixa o arquivo legível

        OutputStream arquivoescrita = new FileOutputStream("tcc2.txt"); //Inserir o arquivo
        Writer escrever = new OutputStreamWriter(arquivoescrita); //Identifica os Bytes
        BufferedWriter bw = new BufferedWriter(escrever); //Deixa o arquivo legível

        String linha = br.readLine(); //Jogar numa String para ler a linha inteira

        while (linha != null && !linha.isEmpty()) {

            bw.write(linha); //Escreve a linha inserida
            bw.newLine();
            linha = br.readLine();

        }

        br.close();
        bw.close();

    }

}
