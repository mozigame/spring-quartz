package com.jf.quartz.controller;

/**
 * program: spring-quartz
 * des:
 * author: Terra
 * create: 2018-06-11 10:51
 **/

import com.jf.quartz.dao.QuartzTest;
import com.jf.quartz.job.ParseCronJob;
import com.jf.quartz.job.ParseModelJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author niewei
 */
@RestController
public class TestController {
    @Autowired
    QuartzTest q;

    //添加一个倒计时任务
    @RequestMapping("add")
    public Object add(String name) {
        return q.addJob(name, ParseModelJob.class, "我是你的人", 2, "001");
    }

    //删除一个倒计时任务
    @RequestMapping("remove")
    public Object remove(String name) {
        return q.closeJob(name, "001");
    }

    //从数据库加载还未执行的任务（spring容器初始化的时候会自动加载）
    @RequestMapping("resume")
    public Object resume(String name) {
        q.resumeJob();
        return "OK";
    }


    //添加一个倒计时任务
    @RequestMapping("add_cron")
    public Object addCron(String name, String task, String groupName) {
        return q.addCronJob(name, ParseCronJob.class, task, 5, groupName);
    }
}