package chapter8.execrrise;

import chapter8.execrrise.Shape;

public class Shapes {
 //
	private static RandomShapeGenerator gen=new RandomShapeGenerator();
	public static void main(String[] args) {
		Shape[] s=new Shape[9];
		for(int i=0;i<s.length;i++){
			s[i]=gen.next();
			
		}
		for(Shape shp:s){
			shp.draw();
			shp.print();
		}
		Shape s2=new Circle();
		s2.draw();
		s2.erase();
		s2.print();
			
	}
}
