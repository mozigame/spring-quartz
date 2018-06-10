package com.jf.quartz.po;

import lombok.Data;

@Data
public class QrtzTriggers {
    private String jobName;

    private String jobGroup;

    private String description;

    private Long nextFireTime;

    private Long prevFireTime;

    private Integer priority;

    private String triggerState;

    private String triggerType;

    private Long startTime;

    private Long endTime;

    private String calendarName;

    private Short misfireInstr;

    private byte[] jobData;

    private String schedName;

    private String triggerName;

    private String triggerGroup;
}