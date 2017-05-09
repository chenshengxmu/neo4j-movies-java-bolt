package example.movies.util;

/**
 * @author Michael Hunger @since 22.10.13
 */
public class Util {
    public static final String DEFAULT_URL = "bolt://neo4j:1234@localhost";
    public static final String WEBAPP_LOCATION = "src/main/webapp/";

    public static int getWebPort() {
        String webPort = System.getenv("PORT");
        if(webPort == null || webPort.isEmpty()) {
            return 8080;
        }
        return Integer.parseInt(webPort);
    }

    public static String getNeo4jUrl() {

        return "bolt://10.232.22.46:7687";
    }
}
