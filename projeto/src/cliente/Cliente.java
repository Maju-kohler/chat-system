import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente implements Runnable {
    //os usuários devem ser capazes de mandar mensagens de textos ou arquivos

    //usado para ler as mensagens
    private final Scanner scanner;

    //main de cada usuario
    public static void main(String[] args) {
        try{
            //cria uma nova instancia do cliente
            Cliente cliente = new Cliente();

            //inicia ele no servidor
            cliente.start();
        }catch(IOException e ){
            System.out.println("Erro ao conectar ao servidor" + e.getMessage());
        }
    }

    private void start() throws IOException {
        //conecta a instancia no socket usando o endereço do servidor e a porta
        final Socket socket = new Socket(SERVER_ADDRESS, BlockingChatServerApp.PORT);

        //inicia instancia 
        clientSocket = new ClientSocket(socket);

        System.out.println(
            "Cliente conectado ao servidor no endereço " + SERVER_ADDRESS +
            " e porta " + BlockingChatServerApp.PORT);

        //inicia um login (pergunta usuário)
        login(); //TODO: fazer o login

        //coloca isso tudo numa thread
        new Thread(this).start();
        
        Scanner comando = new Scanner(System.in);

        
        inputMessage();
    }

    public Cliente() {
        //cria uma instancia de cliente que tem um leitor;
        scanner = new Scanner(System.in);
    }


    private void login() {
        System.out.print("Digite seu login: ");
        final String login = scanner.nextLine();
        clientSocket.setLogin(login);
        clientSocket.sendMsg(login);
    }

    private void inputMessage() {
        String msg;
        do {
            System.out.print("Digite uma msg (ou 'sair' para encerrar): ");
            msg = scanner.nextLine();
            clientSocket.sendMsg(msg);
        } while(!"sair".equalsIgnoreCase(msg));
        clientSocket.close();
    }

    //-----------------------------------------------------------------------

    public void comando(){
        String comandoMsg = "";

        while(comandoMsg != "/sair"){
            System.out.println("O que deseja fazer?");

            //rascunhao
            if(comandoMsg == "/send message"){
                //funcao send message
            }
            else if(comandoMsg == "/send");
        }
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
