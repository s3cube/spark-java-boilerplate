import routes.HelloRoute;

import static spark.Spark.get;
import static spark.Spark.init;
import static spark.Spark.port;

public class Server {

    public void startServer(){
        port(8080);
        init();
    }

    public void initRoutes(){

        get("/hello", new HelloRoute());

    }
}
