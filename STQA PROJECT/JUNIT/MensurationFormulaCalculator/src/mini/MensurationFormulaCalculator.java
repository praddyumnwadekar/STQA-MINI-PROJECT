package mini;

import java.util.Scanner;


public class MensurationFormulaCalculator {
	
	private static Scanner s;

	public static void read() {
		s = new Scanner(System.in);
	}

	public static float area_of_circle(float r) {
		
		if(r < 0)
		{
			return -1;
		}
		
		System.out.println("1.Area of a Circle");
		System.out.println("Enter radius:");
		//float r = s.nextFloat();
		float ac = 3.14f * r * r;
		System.out.println("Area:" + ac);
		return ac;
	}

	

	public static int area_of_squre(int x) {
		
		if(x < 0)
		{
			return -1;
		}
		System.out.println("3.Area of a Square");
		System.out.println("Enter side:");
		//int x = s.nextInt();
		int as = x * x;
		System.out.println("Area:" + as);
		return as;
	}

	public static int perimeter_of_squre(int X) {
		
		if(X < 0)
		{
			return -1;
		}
		
		System.out.println("4.Perimeter of Square");
		System.out.println("Enter side:");
		//int X = s.nextInt();
		int p = 4 * X;
		System.out.println("Perimeter:" + p);
		return p;
	}

	public static float right_angled(float h, float bs) {
	
		if(h < 0 || bs < 0)
		{
			return - 1;
		}
		
		System.out.println("5.Area of a Right Angled Triangle");
		System.out.println("Enter height and base:");
		//float h = s.nextFloat();
		//float bs = s.nextFloat();
		float art = 0.5f * h * bs;
		System.out.println("Area:" + art);
		return art;
	}

	public static int area_of_rectangle(int l,int b) {
	
		if(l < 0 || b < 0)
		{
			return - 1;
		}
		
		System.out.println("6.Area of a Rectangle");
		System.out.println("Enter length and breadth:");
//		int l = s.nextInt();
//		int b = s.nextInt();
		int ar = l * b;
		System.out.println("Area:" + ar);
		return ar;
	}

	public static float circumference_of_circle(int R) {
		if(R < 0)
		{
			return -1;
		}
		System.out.println("7.Circumference of a Circle");
		System.out.println("Enter radius:");
	//	float R = s.nextFloat();
		float C = 3.14f * 2f * R;
		System.out.println("Circumference:" + C);
		return C;
	}

	public static int area_of_cube(int a) {
		
		if(a < 0)
		{
			return -1;
		}
		
		System.out.println("8.Area of cube");
		System.out.println("Enter area of cube:");
	//	int a = s.nextInt();
		int acc = 6 * a * a;
		System.out.println("Cube:" + acc);
		return acc;
	}

	public static int perimeter_of_rectangle(int l, int b) {
		if(l < 0 || b < 0)
		{
			return - 1;
		}
		System.out.println("9.Perimeter of a rectangle");
		System.out.println("Enter length and breadth:");
//		int l = s.nextInt();
//		int b = s.nextInt();
		int arr = 2 * (l + b);
		System.out.println("Perimeter:" + arr);
		return arr;
	}

	public static float area_of_sphere(float r) {
		if(r < 0 )
		{
			return - 1;
		}
		System.out.println("10.Area of sphere");
		System.out.println("Enter radius:");
	//	float r = s.nextFloat();
		float sp = 3.14f * 4 * r * r;
		System.out.println("Surface_Area:" + sp);
		return sp;
	}

	public static float cylinder(int r, int h) {
		if(h < 0 || r < 0)
		{
			return - 1;
		}
		System.out.println("11.Volume of cylinder");
		
//		int h = s.nextInt();
//		int b = s.nextInt();
		float vc = 3.14f * r * r * h;
		System.out.println("Volume:" + vc);
		return vc;
	}

	public static float area_of_cylinder(float r, float h) {
		if(r < 0 || h < 0)
		{
			return - 1;
		}
		System.out.println("12.Area of cylinder");
		System.out.println("Enter radius and height:");
//		float r = s.nextFloat();
//		float h = s.nextFloat();
		float sc = 3.14f * 2 * r * (r + h);
		
		
		System.out.println("Area_of_cylinder:" + sc);
		return sc;
	}

//	public static void main(String[] args) {
//		read();
//		area_of_circle();
//		area_of_squre();
//		area_of_rectangle();
//		area_of_cube();
//		right_angled();
//		area_of_sphere();
//		area_of_cylinder();

//		perimeter_of_squre();
//		perimeter_of_rectangle();
//		circumference_of_circle();

//		cylinder();
//	}

}
