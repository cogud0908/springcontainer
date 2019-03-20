package config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.douzone.springcontainer.videosystem.Avengers;
import com.douzone.springcontainer.videosystem.DVDPlayer;
import com.douzone.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
public class VideoSystemConfig {
	
	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
	//@Bean
	public DVDPlayer dvdPlayer() {
		return new DVDPlayer( avengers() );
	}

//	@Bean
//	public DVDPlayer dvdPlayer(DigitalVideoDisc dvd) {
//		return new DVDPlayer( dvd );
//	}
	
	@Bean
	public DVDPlayer dvdPlayer(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDigitalVideoDisc(dvd);
		return dvdPlayer;
	}
	
//	@Bean(name="dvdPlayer1")
//	public DVDPlayer dvdPlayer() {
//		return new DVDPlayer(avengers());
//	}
//
//	@Bean(name="dvdPlayer2")
//	public DVDPlayer anotherDVDPlayer() {
//		return new DVDPlayer(avengers());
//	}
}
