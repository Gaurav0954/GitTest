class Circle {
	double radius;
	
	double findArea(){
		return radius*radius*3.14149;
	}
	Circle(){
		radius=6;
	}

	void displayArea(){
		System.out.println("Area =" + findArea());
	}
}

class CircleDemo{
	public static void main(String arg[]){
		Circle c=new Circle();
		//c.radius=5;
		c.displayArea();

	}
}