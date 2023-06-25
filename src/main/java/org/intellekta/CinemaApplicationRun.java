package org.intellekta;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
//Приведение списка фильмов
        Cinema c1 = new Cinema("The Shawshank Redemption", "Drama", 3);
        Cinema c2 = new Cinema("The Godfather", "Criminal", 3);
        Cinema c3 = new Cinema("The Dark Knight", "Action", 2);
        Cinema c4 = new Cinema(" Schindler's List", "Historical", 3);
        Cinema c5 = new Cinema("The Lord of the Rings: The Return of the King", "Adventure",3);
        Cinema c6 = new Cinema("Pulp fiction", "Criminal",3);
        Cinema c7 = new Cinema("The Good, the Bad and the Ugly","Vestern", 3);
        Cinema c8 = new Cinema("Forrest Gump", "Drama",3);
        Cinema c9 = new Cinema(" Spider-Man: Across the Spider-Verse ","Action",2);
        Cinema c10 = new Cinema("Fight Club", "Drama",3);

//Объявление и наполнение пользовательских списков фильмов
        List<Cinema> l1 = new ArrayList<>();
        List<Cinema> l2 = new ArrayList<>();
        List<Cinema> l3 = new ArrayList<>();
        List<Cinema> l4 = new ArrayList<>();
        List<Cinema> l5 = new ArrayList<>();

        l1.add(c1);
        l1.add(c4);
        l1.add(c10);

        l2.add(c5);
        l2.add(c4);
        l2.add(c9);
        l2.add(c3);

        l3.add(c1);
        l3.add(c2);
        l3.add(c8);
        l3.add(c6);
        l3.add(c7);

        l4.add(c2);
        l4.add(c4);
        l4.add(c5);
        l4.add(c9);
        l4.add(c10);

        l5.add(c2);
        l5.add(c3);
        l5.add(c7);
        l5.add(c8);

//Объявление пользователей
        Viewer v1 = new Viewer("Viewer1", 29,l1);
        Viewer v2 = new Viewer("Viewer2", 35,l2);
        Viewer v3 = new Viewer("Viewer3", 21,l3);
        Viewer v4 = new Viewer("Viewer4", 41,l4);
        Viewer v5 = new Viewer("Viewer5", 33,l5);

//Объявление и наполнение списка пользователей
        List<Viewer> viewerList = new ArrayList<>();
        viewerList.add(v1);
        viewerList.add(v2);
        viewerList.add(v3);
        viewerList.add(v4);
        viewerList.add(v5);

//Подсчет и выведение в консоль среднего возраста
        System.out.println(ViewerStatistics.averageAge(viewerList));
    }

    /* Ниже приведен закомментированный метод на случай,
    если в методе не требовалось создавать объекты классов Cinema и Viewer */

//    public static void count(Viewer viewer1, Viewer viewer2,
//                             Viewer viewer3, Viewer viewer4,
//                             Viewer viewer5){
//        List<Viewer> viewerList = new ArrayList<>();
//        viewerList.add(viewer1);
//        viewerList.add(viewer2);
//        viewerList.add(viewer3);
//        viewerList.add(viewer4);
//        viewerList.add(viewer5);
//        ViewerStatistics.averageAge(viewerList);
//    }

}
