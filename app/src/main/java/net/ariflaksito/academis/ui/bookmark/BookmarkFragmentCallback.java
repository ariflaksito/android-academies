package net.ariflaksito.academis.ui.bookmark;

import net.ariflaksito.academis.data.CourseEntity;

interface BookmarkFragmentCallback {
    void onShareClick(CourseEntity course);
}
