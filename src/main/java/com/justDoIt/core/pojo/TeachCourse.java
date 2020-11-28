package com.justDoIt.core.pojo;

import java.io.Serializable;

public class TeachCourse implements Serializable {
    private static final long serialVersionUID = 1L;

    private int teacherID;
    private int courseID;
    private int classID;
    private int arranged;

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

    public int getArranged() {
        return arranged;
    }

    public void setArranged(int arranged) {
        this.arranged = arranged;
    }
}
