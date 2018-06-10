package com.jf.quartz.po;

import lombok.Data;

@Data
public class QrtzBlobTriggers {

    private String schedName;

    private String triggerName;

    private String triggerGroup;

    private byte[] blobData;

}