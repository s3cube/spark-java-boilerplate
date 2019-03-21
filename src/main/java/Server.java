import routes.HelloRoute;
import spark.Request;
import spark.Response;
import spark.Route;

import static routes.HelloRoute.getInstance;
import static spark.Spark.get;
import static spark.Spark.init;
import static spark.Spark.port;

public class Server {

    public void startServer(){
        port(8080);
        init();
    }

    public void initRoutes(){

        get("/hello", (request,response) -> getInstance().handle(request,response));

    }
}
