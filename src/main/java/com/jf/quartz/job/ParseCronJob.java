package com.jf.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * program: spring-quartz
 * des:
 * author: Terra
 * create: 2018-06-11 15:08
 **/
public class ParseCronJob implements Job {

    private static Logger logger = LoggerFactory.getLogger(ParseCronJob.class);
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("---->>>>>>here is cron job, jobName:{}, instanceId:{}", context.getResult(), context.getJobInstance());
    }
}
