package com.jf.quartz.service;

import org.quartz.SchedulerException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.ParseException;
import java.util.List;

/**
 * User: joey
 * Date: 2018/6/11
 * Time: 3:07
 */
public interface ISchedulerService {

    /**
     * @param jobName          任务名
     * @param jobGroupName     任务组名
     * @param triggerName      触发器名
     * @param triggerGroupName 触发器组名
     * @param jobClass         任务
     * @param time             时间设置，参考quartz说明文档
     * @throws ParseException
     * @throws SchedulerException
     * @Description: 添加一个定时任务
     */
    Boolean addJod(String jobName, String jobGroupName,
                   String triggerName, String triggerGroupName, Class jobClass,
                   String time) throws ParseException, SchedulerException;


    /**
     * @param jobName          任务名
     * @param jobGroupName     任务组名
     * @param triggerName      触发器名
     * @param triggerGroupName 触发器组名
     * @Description: 移除一个任务
     */
    public void removeJob(String jobName, String jobGroupName,
                          String triggerName, String triggerGroupName) throws ParseException, SchedulerException;

    /**
     * @param triggerName      触发器名称
     * @param triggerGroupName 触发器组名称
     * @param time
     * @Description: 修改一个任务的触发时间
     */
    public Boolean modifyJobTime(String triggerName,
                                 String triggerGroupName, String time) throws ParseException, SchedulerException;

    /**
     * @param triggerName      触发器名称
     * @param triggerGroupName 触发器组名称
     * @Description: 修改一个任务的触发时间
     */
    public List<QuartzJobBean> getTriggerS(String triggerName,
                                           String triggerGroupName) throws ParseException, SchedulerException;

    /**
     * @param jobName   任务名称
     * @param groupName 任务组名称
     * @Description: 暂停任务，但当前任务会执行完毕，执行完毕则不会继续执行了
     */
    public void pauseJob(String jobName,
                         String groupName) throws SchedulerException;
}
