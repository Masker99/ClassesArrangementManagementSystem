package com.justDoIt.core.service.impl;

import com.justDoIt.common.utils.ArrangeCourseUtil;
import com.justDoIt.core.dao.ClassroomDao;
import com.justDoIt.core.dao.CourseScheduleDao;
import com.justDoIt.core.dao.TeachCourseDao;
import com.justDoIt.core.pojo.Classroom;
import com.justDoIt.core.pojo.CourseSchedule;
import com.justDoIt.core.pojo.TeachCourse;
import com.justDoIt.core.service.ArrangeCourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("arrangeCourseService")
public class ArrangeCourseServiceImpl implements ArrangeCourseService {
    @Resource(name="courseScheduleDao")
    private CourseScheduleDao courseScheduleDao;
    @Resource(name="teachCourseDao")
    private TeachCourseDao teachCourseDao;
    @Resource(name = "classroomDao")
    private ClassroomDao classroomDao;

    @Override
    public boolean arrangeCourses() {
        List<TeachCourse> teachCourseList = readTeacherCourse();
        List<CourseSchedule> courseScheduleList = new ArrayList<>();
        List<Classroom> classroomList = readClassroom();

        CourseSchedule courseSchedule = new CourseSchedule();
        courseSchedule.setSchool_year(ArrangeCourseUtil.school_year);
        courseSchedule.setSemester(ArrangeCourseUtil.semester);

        for(TeachCourse oneTeachCourse:teachCourseList){
            courseSchedule.setClassID(oneTeachCourse.getClassID());
            courseSchedule.setCourseID(oneTeachCourse.getCourseID());
            courseSchedule.setTeacherID(oneTeachCourse.getTeacherID());

            if(!hadArranged(courseSchedule)){
                for(Classroom classroom : classroomList)
                    for (int day : ArrangeCourseUtil.weekday)
                        for (int session : ArrangeCourseUtil.session) {
                            courseSchedule.setRoomID(classroom.getRoomID());
                            courseSchedule.setWeekday(day);
                            courseSchedule.setSession(session);

                            if (!isConflict(courseSchedule)) {
                                courseScheduleList.add(courseSchedule);
                            }
                        }
            }
        }

        writeInCourseSchedule(courseScheduleList);
        return true;
    }

    @Override
    public boolean hadArranged(CourseSchedule courseSchedule) {
        boolean hadArranged = false;

        if(courseScheduleDao.findCourseScheduleByAllId(courseSchedule.getTeacherID(),courseSchedule.getClassID(),courseSchedule.getCourseID()) != null){
            hadArranged = true;
        }

        return hadArranged;
    }

    @Override
    public List<TeachCourse> readTeacherCourse() {
        List<TeachCourse> teachCourseList;
        teachCourseList = teachCourseDao.findAllTeachCourse(ArrangeCourseUtil.school_year,ArrangeCourseUtil.semester);

        return teachCourseList;
    }

    @Override
    public boolean isConflict(CourseSchedule courseSchedule) {
        boolean isConflict = false;

        int teacher_id = courseSchedule.getTeacherID();
        int class_id = courseSchedule.getClassID();
        String room_id = courseSchedule.getRoomID();
        int weekday = courseSchedule.getWeekday();
        int session = courseSchedule.getSession();
        int semester = courseSchedule.getSemester();
        String school_year = courseSchedule.getSchool_year();

        if(courseScheduleDao.isConflictForTeacher(teacher_id,weekday,session,school_year,semester)!=null){
            isConflict = true;
        }else if(courseScheduleDao.isConflictForClass(class_id,weekday,session)!=null){
            isConflict = true;
        }else if(courseScheduleDao.isConflictForRoom(room_id,weekday,session,school_year,semester)!=null){
            isConflict = true;
        }

        return isConflict;
    }

    @Override
    public CourseSchedule dealConflict(CourseSchedule courseSchedule) {
        return null;
    }

    @Override
    public List<Classroom> readClassroom() {
        List<Classroom> classroomList = classroomDao.findAllClassroom();

        return classroomList;
    }

    @Override
    public void writeInCourseSchedule(List<CourseSchedule> courseScheduleList) {

    }
}
