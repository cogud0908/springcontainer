package config.mixing.videosystem;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.springcontainer.videosystem.DVDPlayer;
import com.douzone.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
@Import(DVDConfig.class)
public class DVDPlayerConfig {

	@Bean
	public DVDPlayer dvdPlayer(@Qualifier("avengers") DigitalVideoDisc dvd) {
		return new DVDPlayer( dvd );
	}
}
