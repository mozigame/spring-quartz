package com.jf.quartz.po;

import lombok.Data;

@Data
public class QrtzJobDetails {
    private String description;

    private String jobClassName;

    private String isDurable;

    private String isNonconcurrent;

    private String isUpdateData;

    private String requestsRecovery;

    private byte[] jobData;

    private String schedName;

    private String jobName;

    private String jobGroup;
}