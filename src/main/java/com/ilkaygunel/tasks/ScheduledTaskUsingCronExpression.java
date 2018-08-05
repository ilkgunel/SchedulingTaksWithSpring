package com.ilkaygunel.tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTaskUsingCronExpression {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Scheduled(cron = "0 * * * * ?")
	public void scheduledTaskUsingCronExpression() {
		System.out.println("Scheduled Task Using Cron Expression Task Worked! " + dateFormat.format(new Date()));
	}
}
