package com.example.cronjob.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class CronJobService {

	@Scheduled(cron = "*/10 * * * * *") // Run every ten seconds
	public void runCronJob() {
		System.out.println("Hello, World! - Cron Job Executed");
	}

}
