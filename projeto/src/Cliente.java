import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente implements Runnable {
    //os usuários devem ser capazes de mandar mensagens de textos ou arquivos


    private final Scanner scanner;


    public static void main(String[] args) {
        try{
            Cliente cliente = new Cliente();
            cliente.start();
        }catch(IOException e ){
            System.out.println("Erro ao conectar ao servidor" + e.getMessage());
        }
    }

    public
    //-------------------------------

    //identificação do usuário
    String nome = "";
    String IP = "00.00.00";

    public Cliente() {
        scanner = new Scanner(System.in);
    }

    //permitir listar todos os clientes conetados quando o usuário digitar /users
    public void list(){

    }

    //a qualquer momento o usuário pode encerrar a conexão ao digitar /sair
    public void sair(){

    }

    //O envio de mensagens deve utilizar o comando /send message <mensagem>;
    public void send(){
        //send message <mensagem>

        //send file <caminho do arquivo>
    }
}
