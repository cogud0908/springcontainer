package com.douzone.springcontainer.soundsystem;

import javax.inject.Named;

//@Component
@Named("blueBlood")
public class BlueBlood implements CompactDisc {
	private String title = "Endless Rain";
	private String artist = "X Japan";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	@Override
	public String toString() {
		return "BlueBlood [title=" + title + ", artist=" + artist + "]";
	}
}
