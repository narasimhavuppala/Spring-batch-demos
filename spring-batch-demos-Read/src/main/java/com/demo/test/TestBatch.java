package com.demo.test;

import java.util.Calendar;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBatch {

	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException,
			JobInstanceAlreadyCompleteException, JobParametersInvalidException {

		ApplicationContext context = new ClassPathXmlApplicationContext("batch-config.xml");
		JobLauncher launcher = context.getBean(JobLauncher.class);
		Job job = context.getBean(Job.class);
		JobParametersBuilder builder = new JobParametersBuilder();
		builder.addString("environment", "DEV");
		builder.addDate("runDate", Calendar.getInstance().getTime());

		launcher.run(job, builder.toJobParameters());
	}

}
