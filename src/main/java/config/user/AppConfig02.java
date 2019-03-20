package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.springcontainer.user.User;

@Configuration
public class AppConfig02 {
	
	@Bean
	public User user() {
		return new User();
	}

}
