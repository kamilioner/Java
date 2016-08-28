package test;

import data.Point;
import logic.PointController;

public class PointApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point nowyPunkt = new Point(0,0);
		PointController nowaKontr = new PointController();
		
		for(int i = 0; i<5; ++i){
			nowaKontr.addX(nowyPunkt);
		}
		
		System.out.println("WSP£ punktu: "+nowyPunkt.getX()+","+nowyPunkt.getY());
		
		
		
	}

}
