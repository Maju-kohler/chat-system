import java.io.IOException;
import java.net.ServerSocket;
import java.net.SocketException;

public class Servidor {

    //O servidor é reponsável somente por ser intermédio entre os usuários, roteando as mensagens entre eles
    //O servidor deve manter um log em arquivo dos clientes que se conectaram, contendo os endereços IP e a data e hora de conexão.
    public static final int PORT = 4000;
    ServerSocket serverSocket;

    private final List<Cliente> clientes;

    public Servidor() {
        clientes = new LinkedList<>();
    }

    public static void main(String[] args) {
        final Servidor servidor = new Servidor();

        try {
            server.start();
        }catch (IOException e){
            System.err.println("Erro ao iniciar o servidor: "+ e.getMessage());
        }
    }

    private void start() throws IOException {
        serverSocket = new ServerSocket(PORT);
        System.out.println("Servidor iniciado com sucesso no IP e porta:" + serverSocket.getInetAddress().getHostAddress() + " e " + PORT);
        clienteConexaoLoop();
    }

    private void clienteConexaoLoop() throws IOException{
        try{
            while(true){
                final Cliente cliente;
                try{
                    cliente = new Cliente(serverSocket.accept());
                }catch (SocketException e){

                }
            }
        }finally{
            stop();
        }
    }

}
