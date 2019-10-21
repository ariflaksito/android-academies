package net.ariflaksito.academis.ui.detail;

import net.ariflaksito.academis.data.CourseEntity;
import net.ariflaksito.academis.data.ModuleEntity;
import net.ariflaksito.academis.utils.DataDummy;

import java.util.List;

import androidx.lifecycle.ViewModel;

public class DetailCourseViewModel extends ViewModel {
    private CourseEntity mCourse;
    private String courseId;

    public CourseEntity getCourse() {
        for (int i = 0; i < DataDummy.generateDummyCourses().size(); i++) {
            CourseEntity courseEntity = DataDummy.generateDummyCourses().get(i);
            if (courseEntity.getCourseId().equals(courseId)) {
                mCourse = courseEntity;
            }
        }
        return mCourse;
    }

    public List<ModuleEntity> getModules() {
        return DataDummy.generateDummyModules(getCourseId());
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId(){
        return courseId;
    }
}
