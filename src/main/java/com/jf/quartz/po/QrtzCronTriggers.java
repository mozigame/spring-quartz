package com.jf.quartz.po;

import lombok.Data;

@Data
public class QrtzCronTriggers {
    private String cronExpression;

    private String timeZoneId;

    private String schedName;

    private String triggerName;

    private String triggerGroup;

}