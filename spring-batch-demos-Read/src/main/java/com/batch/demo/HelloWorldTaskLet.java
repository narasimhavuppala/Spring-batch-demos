/**
 * 
 */
package com.batch.demo;

import java.util.Date;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * @author Shree
 *
 */
public class HelloWorldTaskLet implements Tasklet {

	private String environment;

	private Date rundate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.batch.core.step.tasklet.Tasklet#execute(org.
	 * springframework.batch.core.StepContribution,
	 * org.springframework.batch.core.scope.context.ChunkContext)
	 */
	@Override
	public RepeatStatus execute(StepContribution arg0, ChunkContext chunk) throws Exception {
		System.out.println("Welcome to Spring Batch  in " + environment + "  environment on " + rundate);
		JobParameters params = chunk.getStepContext().getStepExecution().getJobExecution().getJobParameters();
		
		System.out.println(chunk.getStepContext().getStepExecution().getJobExecution().getJobInstance());
		System.out.println(params);
		return RepeatStatus.FINISHED;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public Date getRundate() {
		return rundate;
	}

	public void setRundate(Date rundate) {
		this.rundate = rundate;
	}

}
