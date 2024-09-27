//DEPS com.h2database:h2:2.3.232

import org.h2.tools.*;

import static org.h2.tools.Server.createTcpServer;

public class H2Server {

    public static void main(String[] ignored) throws Exception {

        Server server = createTcpServer("-ifNotExists").start();

        System.out.println(server.getStatus());

    }
}