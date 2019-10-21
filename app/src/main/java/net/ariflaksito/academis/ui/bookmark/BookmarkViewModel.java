package net.ariflaksito.academis.ui.bookmark;

import net.ariflaksito.academis.data.CourseEntity;
import net.ariflaksito.academis.utils.DataDummy;

import java.util.List;

import androidx.lifecycle.ViewModel;

public class BookmarkViewModel extends ViewModel {
    List<CourseEntity> getBookmarks() {
        return DataDummy.generateDummyCourses();
    }
}
