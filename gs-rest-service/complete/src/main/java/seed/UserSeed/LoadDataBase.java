package seed.UserSeed;



import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import api.model.User;
import api.service.UserService;

@Configuration
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(UserService userService) {
		return args -> {
			User user = new User("Tom", "Tommy", "Tom95", "Tommer", new Date(), new Date());
			userService.save(user);
		};
	}
}
