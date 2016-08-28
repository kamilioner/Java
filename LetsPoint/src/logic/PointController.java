package logic;

import data.Point;

public class PointController {
	
	public void addX(Point a){
			a.setX(a.getX()+1);  
		}// - zwiêksza zmienn¹ x o 1

	public void minusX(Point a){
			a.setX(a.getX()-1);  
		} // - zmniejsza zmienn¹ x o 1

	public void addY(Point a){
			a.setY(a.getY()+1);  
		} // - zwiêksza zmienn¹ y o 1

	public void minusY(Point a){
			a.setY(a.getY()-1);  
		} //- zmniejsza zmienn¹ y o 1
}
