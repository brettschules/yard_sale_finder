package api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
	private final static Logger Logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
    	Logger.info("Starting Up");
        SpringApplication.run(Application.class, args);
    }
}
