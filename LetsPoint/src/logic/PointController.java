package logic;

import data.Point;

public class PointController {
	
	public void addX(Point a){
			a.setX(a.getX()+1);  
		}// - zwi�ksza zmienn� x o 1

	public void minusX(Point a){
			a.setX(a.getX()-1);  
		} // - zmniejsza zmienn� x o 1

	public void addY(Point a){
			a.setY(a.getY()+1);  
		} // - zwi�ksza zmienn� y o 1

	public void minusY(Point a){
			a.setY(a.getY()-1);  
		} //- zmniejsza zmienn� y o 1
}
