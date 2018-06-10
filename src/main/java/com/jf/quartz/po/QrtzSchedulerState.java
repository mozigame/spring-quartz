package com.jf.quartz.po;

import lombok.Data;

@Data
public class QrtzSchedulerState{
    private Long lastCheckinTime;

    private Long checkinInterval;
    private String schedName;

    private String instanceName;
}