//package com.jf.quartz.service;
//
//import org.quartz.CronExpression;
//import org.quartz.CronTrigger;
//import org.quartz.JobDetail;
//import org.quartz.Scheduler;
//import org.quartz.SchedulerException;
//import org.quartz.Trigger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.google.common.collect.Lists;
//import com.yestae.tss.common.quartz.VO.QuartzJobVo;
//import java.text.ParseException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * User: joey
// * Date: 2018/6/11
// * Time: 3:07
// */
//public class SchedulerServiceImpl implements ISchedulerService {
//    @Autowired
//    private Scheduler scheduler;
//
//    @Override
//    public Boolean addJod(String jobName, String jobGroupName,
//                          String triggerName, String triggerGroupName, Class jobClass,
//                          String time) throws ParseException, SchedulerException {
//
//        JobDetail jobDetail = new JobDetail(jobName, jobGroupName, jobClass);// 任务名，任务组，任务执行类
//        jobDetail.setDurability(true);   //任务完成后任然将任务保存在数据库
//        // 触发器
//        CronTrigger trigger = new CronTrigger(triggerName, triggerGroupName);// 触发器名,触发器组
//        trigger.setCronExpression(time);// 触发器时间设定
//        scheduler.scheduleJob(jobDetail, trigger);
//
//        return null;
//    }
//
//    @Override
//    public void removeJob(String jobName, String jobGroupName,
//                          String triggerName, String triggerGroupName) throws ParseException,
//            SchedulerException {
//
//        scheduler.pauseTrigger(triggerName, triggerGroupName);// 停止触发器
//        scheduler.unscheduleJob(triggerName, triggerGroupName);// 移除触发器
//        scheduler.deleteJob(jobName, jobGroupName);// 删除任务
//        return;
//    }
//
//    @Override
//    public Boolean modifyJobTime(String triggerName, String triggerGroupName,
//                                 String time) throws ParseException, SchedulerException {
//        CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerName,triggerGroupName);
//        if (trigger == null) {
//            return false;
//        }
//        String oldTime = trigger.getCronExpression();
//        if (!oldTime.equalsIgnoreCase(time)) {
//            // 修改时间
//            trigger.setCronExpression(time);
//            // 重启触发器
//            scheduler.resumeTrigger(triggerName, triggerGroupName);
//        }
//        return null;
//    }
//
//    @Override
//    public List<QuartzJobVo> getTriggerS(String triggerName, String triggerGroupName)
//            throws ParseException, SchedulerException {
//        List<QuartzJobVo> list = Lists.newArrayList();
//        //获取任务名称
//        for (String groupName : scheduler.getJobGroupNames()) {
//
//            for (String jobName : scheduler.getJobNames(groupName)) {
//                QuartzJobVo quartzJobVo = new QuartzJobVo();
//                Trigger[] triggers = scheduler.getTriggersOfJob(jobName,groupName);
//                CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggers[0].getName(), triggers[0].getGroup());
//                quartzJobVo.setJobName(jobName);
//                quartzJobVo.setJobGroupName(groupName);
//                quartzJobVo.setTriggerGroupName(triggers[0].getGroup());
//                quartzJobVo.setTriggerName(triggers[0].getName());
//                quartzJobVo.setCronExpression(trigger.getCronExpression());
//                list.add(quartzJobVo);
//            }
//
//        }
//        return list;
//    }
//
//    @Override
//    public void pauseJob(String jobName, String groupName)
//            throws SchedulerException {
//        scheduler.pauseJob(jobName, groupName);
//        return;
//    }
//}
