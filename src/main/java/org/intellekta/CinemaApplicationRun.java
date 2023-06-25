package org.intellekta;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {

        List<Viewer> viewerList = new ArrayList<>();
        viewerList.add(new Viewer("viewer1", 29,32));
        viewerList.add(new Viewer("viewer2", 35,190));
        viewerList.add(new Viewer("viewer3", 21,47));
        viewerList.add(new Viewer("viewer4", 41,156));
        viewerList.add(new Viewer("viewer5", 33,98));

        ViewerStatistics .averageAge(viewerList);
    }
}
