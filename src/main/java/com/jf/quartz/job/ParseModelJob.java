package com.jf.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;

/**
 * User: joey
 * Date: 2018/6/11
 * Time: 3:06
 */
public class ParseModelJob implements Job {


    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //这里输入任务处理的内容
    }
}
