package com.ilkaygunel.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedRateScheduledTask {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 5000)
	public void fixedRateScheduledTaskMethod() {
		System.out.println("Fixed Rate Scheduled Task Worked! " + dateFormat.format(new Date()));
	}
}