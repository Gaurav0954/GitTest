import java.util.*;
class Box{
	double width;
	double height;
	double depth;

	Box(double width, double height, double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;	
	}

	void setDim(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Width");
		width=s.nextInt();
		System.out.println("Enter Height");
		height=s.nextInt();
		System.out.println("Enter Depth");
		depth=s.nextInt();
	}
	double volume(){
		return width*height*depth;
	}
}

class BoxDemo{
	public static void main(String[] args){
		Box c=new Box(6,6,6);
		//c.setDim();
		double v=c.volume(); 
		System.out.println(v);
	}
}