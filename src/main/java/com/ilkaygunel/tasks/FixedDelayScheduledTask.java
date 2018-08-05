package com.ilkaygunel.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedDelayScheduledTask {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedDelay = 2000)
	public void fixedDelayScheduledTaskMethod() {
		System.out.println("fixedDelayScheduledTaskMethod Task Worked! " + dateFormat.format(new Date()));
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (Exception e) {
			System.out.println("Ran into an error {}" + e);
			throw new IllegalStateException(e);
		}
	}
}
