package com.jf.quartz.po;

import lombok.Data;

@Data
public class QrtzCalendars {
    private String schedName;

    private String calendarName;
    private byte[] calendar;
}