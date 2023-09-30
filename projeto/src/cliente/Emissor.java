public class Emissor {
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
            else if(comandoMsg.equals("/send "));
        }
    }
}