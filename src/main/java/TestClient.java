import client.soap.Hello;
import client.soap.HelloService;

public class TestClient {
    public static void main(String[] args) {
        // 1. On instancie le service généré
        HelloService service = new HelloService();

        // 2. On récupère le "port" (le proxy qui communique avec le serveur)
        Hello port = service.getHelloPort();

        // 3. On appelle la méthode de notre service web !
        String reponse = port.affichermessage("DSI3");

        // 4. On affiche le résultat
        System.out.println("Réponse du serveur : " + reponse);
    }
}