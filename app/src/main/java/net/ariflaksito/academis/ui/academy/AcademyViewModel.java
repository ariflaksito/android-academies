package net.ariflaksito.academis.ui.academy;

import net.ariflaksito.academis.data.CourseEntity;
import net.ariflaksito.academis.utils.DataDummy;

import java.util.List;

import androidx.lifecycle.ViewModel;

public class AcademyViewModel extends ViewModel {

    public List<CourseEntity> getCourses() {
        return DataDummy.generateDummyCourses();
    }
}
