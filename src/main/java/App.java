public class App {


    public static void main(String[] args) {

        Server server = new Server();

        server.startServer();
        server.initRoutes();

    }

}
