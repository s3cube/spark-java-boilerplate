package routes;

import com.google.gson.Gson;
import spark.Request;
import spark.Response;
import spark.Route;

public class HelloRoute implements Route {

    private String num = "";

    public  static Route getInstance(){
        return new HelloRoute();
    }
    @Override
    public Object handle(Request request, Response response) {

        Gson gson = new Gson();

        num = request.queryParams("set");

        return "Hello World Again!!";
    }
}
