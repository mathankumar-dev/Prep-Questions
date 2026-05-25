import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

void main() throws Exception {

    HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

    server.createContext("/hello", (HttpExchange exchange) -> {

        String response = "Hello Backend";

        exchange.sendResponseHeaders(200, response.length());

        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    });

    server.start();

    IO.println("Server running on port 8080");
}