package ru.stqa.pft.sandbox;

public class TaskPoint {
    public static void main(String [] args) {

        Point p1 = new Point(0,1);
        Point p2 = new Point(2,1);
        System.out.println("Расстояние между двумя точками с координатами " + p1.x + " и " + p2.y + " = " +
                + distanse(p1, p2));
    }

    public static double distanse(Point p1, Point p2){
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}
