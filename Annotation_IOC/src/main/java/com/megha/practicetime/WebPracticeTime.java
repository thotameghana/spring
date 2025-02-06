package com.megha.practicetime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("wpt")
public class WebPracticeTime {
	private String time;
	@Autowired
	public void setTime(@Value("2 hours") String time) {
		this.time=time;
	}
	public String getTime() {
		return time;
	}
}
