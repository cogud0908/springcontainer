package com.douzone.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.douzone.springcontainer.soundsystem.CDPlayer;
import com.douzone.springcontainer.soundsystem.CompactDisc;
import com.douzone.springcontainer.videosystem.Avengers;
import com.douzone.springcontainer.videosystem.DVDPack;
import com.douzone.springcontainer.videosystem.DVDPlayer;
import com.douzone.springcontainer.videosystem.DigitalVideoDisc;

public class XMLConfigTest {

	public static void main(String[] args) {
		testXMLConfig01();
		testXMLConfig02();
	}

	// XML Config01 - 자동 설정
	// annotation config
	public static void testXMLConfig01() {
		ApplicationContext appCtx =
				new ClassPathXmlApplicationContext("config/soundsystem/CDPlayerConfig.xml");
		
		CompactDisc cd = appCtx.getBean( CompactDisc.class );
		System.out.println(cd);
		
		CDPlayer cdPlayer = appCtx.getBean( CDPlayer.class );
		cdPlayer.play();
		
		((ConfigurableApplicationContext)appCtx).close();
	}
	
	// XML Config01 - 명시적 설정
	// bean config
	public static void testXMLConfig02() {
		ApplicationContext appCtx =
				new ClassPathXmlApplicationContext("config/videosystem/VideoSystemConfig.xml");

		DigitalVideoDisc dvd = appCtx.getBean( Avengers.class );
		System.out.println(dvd);
		
		dvd = (DigitalVideoDisc)appCtx.getBean( "avengersInfinityWar" );
		System.out.println(dvd);
		
		DVDPack dvdPack = appCtx.getBean( DVDPack.class );
		System.out.println(dvdPack);
		
		DVDPlayer dvdPlayer = appCtx.getBean( DVDPlayer.class );
		dvdPlayer.play();
		
		((ConfigurableApplicationContext)appCtx).close();
	}
}
