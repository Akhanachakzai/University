package Uni;



public class Uni {

	public static void main(String[] args) {
		Student obj1 = new Student();
	}
		// TODO Auto-generated method stub
		  Shape [ ] shapeList = new Shape[5];
          shapeList[0] = new Student("Aurang Khan",1445106,"Mechatronics");
         /* shapeList[1] = new Rectangle(3.0, 4.0);
          shapeList[2] = new Rectangle(2.5, 7.5);
          shapeList[3] = new Circle(2.5);
          shapeList[4] = new Square(5.0);*/
          
         // for (int i = 0; i < shapeList.length; i++)  {
          	System.out.print (shapeList[0].name + "    "	);
	System.out.print (shapeList[0].Reg + "    ");
	///System.out.println (shapeList[0].address( ));
	
	shapeList[0].University();
	//}

}
