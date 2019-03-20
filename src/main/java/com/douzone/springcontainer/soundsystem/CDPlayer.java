package com.douzone.springcontainer.soundsystem;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	//와이어링1
	//@Autowired
	private CompactDisc cd;
	
	//와이어링2
	//@Autowired
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	
	public CDPlayer() {
	}

	//와이어링3
	//@Autowired
	public void setCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	//와이어링4
	//@Autowired
	@Inject
	public void insertCompactDisc(CompactDisc cd) {
		this.cd = cd;
	}
	
	public void play() {
		cd.play();
	}
}