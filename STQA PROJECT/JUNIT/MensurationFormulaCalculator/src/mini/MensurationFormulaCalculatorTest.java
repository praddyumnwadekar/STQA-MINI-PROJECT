package mini;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MensurationFormulaCalculatorTest {

	private float radius;
	private float expectedResult;

	public MensurationFormulaCalculatorTest(float r, float expected) {
		super();
		this.radius = r;
		this.expectedResult = expected;
	}

	@Parameterized.Parameters
	public static Object[][] param() {
		return new Object[][] { { 20, 1256 }, { 50, 7850 } };
	}

	
	
	@Test
	public void testArea_of_circle() {
		// MensurationFormulaCalculator.read();
		float ac = MensurationFormulaCalculator.area_of_circle(radius);
		assertEquals(expectedResult, ac, 0.0002f);
	}
	

	@Test
	public void testArea_of_squre() {
		MensurationFormulaCalculator.read();
		int as = MensurationFormulaCalculator.area_of_squre(25);
		assertEquals(625, as, 0.0002f);
	}

	@Test
	public void testPerimeter_of_squre() {
		MensurationFormulaCalculator.read();
		int p = MensurationFormulaCalculator.perimeter_of_squre(25);
		assertEquals(100, p, 0.0002f);
	}

	@Test
	public void testRight_angled() {
		MensurationFormulaCalculator.read();
		float art = MensurationFormulaCalculator.right_angled(25,16);
		assertEquals(200, art, 0.0002f);
	}

	@Test
	public void testArea_of_rectangle() {
		MensurationFormulaCalculator.read();
		int ar = MensurationFormulaCalculator.area_of_rectangle(12,32);
		assertEquals(384, ar, 0.0002f);
	}

	@Test
	public void testCircumference_of_circle() {
		MensurationFormulaCalculator.read();
		float C = MensurationFormulaCalculator.circumference_of_circle(14);
		assertEquals(87.92, C, 0.0002f);
	}

	@Test
	public void testArea_of_cube() {
		MensurationFormulaCalculator.read();
		int acc = MensurationFormulaCalculator.area_of_cube(32);
		assertEquals(6144, acc, 0.0002f);
	}

	@Test
	public void testPerimeter_of_rectangle() {
		MensurationFormulaCalculator.read();
		int arr = MensurationFormulaCalculator.perimeter_of_rectangle(12,32);
		assertEquals(88, arr, 0.0002f);
	}

	@Test
	public void testArea_of_sphere() {
		MensurationFormulaCalculator.read();
		float sp = MensurationFormulaCalculator.area_of_sphere(45);
		assertEquals(25434.0, sp, 0.0002f);
	}

	@Test
	public void testCylinder() {
		MensurationFormulaCalculator.read();
		float vc = MensurationFormulaCalculator.cylinder(4, 10);
		assertEquals(502.4, vc, 0.0002f);
	}

	@Test
	public void testArea_of_cylinder() {
		MensurationFormulaCalculator.read();
		float sc = MensurationFormulaCalculator.area_of_cylinder(25,15);	
		assertEquals(6280, sc, 0.0002f);
	}
	
	@Test
	public void testArea_of_squreForInvalid_Negative_Attribute() {
		MensurationFormulaCalculator.read();
		int as = MensurationFormulaCalculator.area_of_squre(-45);
		assertEquals(-1, as,0.025);
	}

	@Test
	public void testPerimeter_of_squre_For_Negative_Parameter() {
		MensurationFormulaCalculator.read();
		int p = MensurationFormulaCalculator.perimeter_of_squre(-25);
		assertEquals(-1, p,0.025);
	}
//
	@Test
	public void testRight_angled_For_Negative_Parameter() {
		MensurationFormulaCalculator.read();
		float art = MensurationFormulaCalculator.right_angled(-24,-54);
		assertEquals(-1, art,0.025);

	}

	@Test
	public void testArea_of_rectangle_For_Negative_Parameter() {
		MensurationFormulaCalculator.read();
		int ar = MensurationFormulaCalculator.area_of_rectangle(-15,-13);
		assertEquals(-1, ar,0.025);
	}

	
	@Test
	public void testArea_of_circleFor_Negative_Parameter() {
		// MensurationFormulaCalculator.read();
		float ac = MensurationFormulaCalculator.area_of_circle(-30);
		assertEquals(-1, ac, 0.0002f);
	}
	
	@Test
	public void testCircumference_of_circle_For_Negative_Parameter() {
		MensurationFormulaCalculator.read();
		float C = MensurationFormulaCalculator.circumference_of_circle(-52);
		assertEquals(-1, C,0.025);
	}

	@Test
	public void testArea_of_cube_For_Negative_Parameter() {
		MensurationFormulaCalculator.read();
		int acc = MensurationFormulaCalculator.area_of_cube(-32);
		assertEquals(-1, acc,0.025);
	}

	@Test
	public void testPerimeter_of_rectangle_For_Negative_Parameter() {
		MensurationFormulaCalculator.read();
		int arr = MensurationFormulaCalculator.perimeter_of_rectangle(-12,-32);
		assertEquals(-1, arr,0.025);
	}

	@Test
	public void testArea_of_sphere_For_Negative_Parameter() {
		MensurationFormulaCalculator.read();
		float sp = MensurationFormulaCalculator.area_of_sphere(-45);
		assertEquals(-1, sp,0.025);
	}

	@Test
	public void testCylinder_For_Negative_Parameter() {
		MensurationFormulaCalculator.read();
		float vc = MensurationFormulaCalculator.cylinder(-12,-12);
		assertEquals(-1, vc,0.025);
	}

	@Test
	public void testArea_of_cylinder_For_Negative_Parameter() {
		MensurationFormulaCalculator.read();
		float sc = MensurationFormulaCalculator.area_of_cylinder(-32,-65);
		assertEquals(-1, sc, 0.025);
	}

}
