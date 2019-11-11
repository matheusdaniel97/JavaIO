import java.io.*;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        FileInputStream arquivo = new FileInputStream("tcc.txt"); //Inserir o arquivo
        InputStreamReader leitor = new InputStreamReader(arquivo); //Identifica os Bytes
        BufferedReader br = new BufferedReader(leitor); //Deixa o arquivo legível

        String linha = br.readLine(); //Jogar numa String para ler a linha inteira

        while (linha != null) {

            System.out.println(linha); //Escreve a linha inserida
            linha = br.readLine();

        }
        br.close();

    }

}
