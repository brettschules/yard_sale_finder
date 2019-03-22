package seed.UserSeed;



import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
class LoadDatabase {
	private final static Logger Logger = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase() {
		
		return args -> {
			Logger.info("Hiiii");
//			log.info("Logger enabled: Entering main \n\n");
//			log.info("hi")
//			log.info(new User("Tom", "Tommy", "Tom95", "Tommer", new Date(), new Date()));
		};
	}
}
