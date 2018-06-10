package com.jf.quartz.po;

public class QrtzSimpleTriggers {
    private Long repeatCount;

    private Long repeatInterval;

    private Long timesTriggered;
    private String schedName;

    private String triggerName;

    private String triggerGroup;


    public Long getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
    }

    public Long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public Long getTimesTriggered() {
        return timesTriggered;
    }

    public void setTimesTriggered(Long timesTriggered) {
        this.timesTriggered = timesTriggered;
    }
}