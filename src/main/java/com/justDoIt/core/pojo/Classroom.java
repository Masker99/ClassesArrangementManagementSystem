package com.justDoIt.core.pojo;

import java.io.Serializable;

public class Classroom implements Serializable {
    private static final long serialVersionUID = 1L;

    private String roomID;
    private int capacity;
    private int isMultimedia;

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getIsMultimedia() {
        return isMultimedia;
    }

    public void setIsMultimedia(int isMultimedia) {
        this.isMultimedia = isMultimedia;
    }
}
