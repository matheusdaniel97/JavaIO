import java.io.*;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Cliente cliente = new Cliente();
//
//        cliente.setNome("Matheus");
//        cliente.setProfissao("QA - TESTE");
//        cliente.setCpf("11111111111");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//
//        oos.writeObject(cliente);
//
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));

        Cliente cliente = (Cliente) ois.readObject();

        ois.close();

        System.out.println(cliente.getProfissao());

    }

}
