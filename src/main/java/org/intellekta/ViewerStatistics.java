package org.intellekta;

import java.util.List;

public class ViewerStatistics {

    public static int averageAge(List<Viewer> viewerList){
        int sum = 0;
        for(Viewer v : viewerList){
            sum+=v.getAge();
        }
        return sum/ viewerList.size();
    }
}
