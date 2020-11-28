package com.justDoIt.core.pojo;

import java.io.Serializable;

public class TimePlan implements Serializable {
    private static final long serialVersionUID = 1L;

    private int section;
    private int time;

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
