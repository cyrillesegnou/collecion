package fr.gtm.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainPoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Point> points = new ArrayList<Point>();
		points.add(new Point(1, 1));
		points.add(new Point(1, 1));
		points.add(new Point(2, 2));
		points.add(new Point(3, 3));

		// lecture seulle "foreach' on ne peut pas supprimer des éléments
		for (Point p : points) {
			System.out.println(p.toString());
		}
		System.out.println("=========================");
		for (int i = 0; i < points.size(); i++) {

			Point p = points.get(i);
			System.out.println(p);

		}
		System.out.println("===========");

		// parcours par itérateur
		Iterator<Point> it = points.iterator();
		while (it.hasNext()) {
			Point p = it.next();
			System.out.println(p);
		}

	}

}
