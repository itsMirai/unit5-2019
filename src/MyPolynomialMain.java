
public class MyPolynomialMain {

	public static void main(String[] args) {
		
		MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
		MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
		// Can also invoke with an array
		double[] coeffs = {1.2, 3.4, 5.6, 7.8, 3.5};
		MyPolynomial p3 = new MyPolynomial(coeffs);
		/*MyPolynomial p4 = new MyPolynomial("poly");*/
		
		System.out.println(p1);
		System.out.println(p2);
		
		System.out.println(p1.add(p2));
		
		
	}
}
