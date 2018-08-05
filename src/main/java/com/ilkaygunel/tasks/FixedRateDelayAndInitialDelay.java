package com.ilkaygunel.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedRateDelayAndInitialDelay {
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(fixedRate = 2000, initialDelay = 5000)
	public void fixedRateDelayAndInitialDelay() {
		System.out.println("Fixed Rate Delay And Initial Delay Task Worked! " + dateFormat.format(new Date()));
	}
}