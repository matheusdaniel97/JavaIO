import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        String nome = "Matheus Daniel";
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("arquivo.bin"));
//
//        oos.writeObject(nome);
//
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("arquivo.bin"));

        String nome = (String) ois.readObject();

        ois.close();

        System.out.println(nome);

    }

}
