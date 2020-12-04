package com.justDoIt.core.pojo;

import java.io.Serializable;

public class CourseSchedule implements Serializable {
    private static final long serialVersionUID = 1L;

    private int teacherID;
    private int courseID;
    private int classID;
    private String roomID;
    private int weekday;
    private int session;
    private String school_year;
    private int semester;

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public int getWeekday() {
        return weekday;
    }

    public void setWeekday(int weekday) {
        this.weekday = weekday;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public String getSchool_year() {
        return school_year;
    }

    public void setSchool_year(String school_day) {
        this.school_year = school_day;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
