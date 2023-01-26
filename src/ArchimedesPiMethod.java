/**
 *
 * @author Trevor Hartman
 * @author Bryan Maus
 *
 * @since Version 1.0
 * Date: 01-26-2023
 *
 */

import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
int h,n;

/* h is for the radius of the circle or the hypotenuse of the triangle and n is for the number of sides on
  a single polygon. There are measurements for two polygons, inner and outer, or smaller and bigger
 */

double B, A, ss, bs, sp, bp, sPI, bPI, Avg;

/* B is the radius of the circle, A is to split the triangle and obtain
 * a right triangle. Variables that start with s are for the small polygon and the b is for big polygon
 * s is the length of the opposite side of the triangle. p is for perimeter of the polygon. PI is for the
 * estimate of pi. Avg is deduced by subtracting the small polygon perimeter (sPI) from the larger one(bPI),
 * spitting the result in half, then add the result to the smaller polygon (sPI)
 *
 */

h=1; n=8; B=360.0/n; A=(h/2.0)*B;

ss=2*h*(Math.sin(Math.toRadians(A))); sp=n*ss; sPI=sp/(2*h); //Calculation for the smaller polygon

bs=2*h*(Math.tan(Math.toRadians(A))); bp=n*bs; bPI=bp/(2*h); //Calculation for the bigger polygon

Avg=((bPI-sPI)/2)+sPI;

        System.out.println("\nThe value of the hypotenuse is: " + h);
        System.out.println("The number of sides on the polygon is: " + n);
        System.out.println("The radius of the circle is: " + B);
        System.out.println("The altitude of the triangle is: " + A + "\n");
        System.out.println("The small polygon opposite side of the right triangle is: " + ss);
        System.out.println("The small polygon perimeter is: " + sp);
        System.out.println("The small polygon average for pi is: " + sPI + "\n");
        System.out.println("The big polygon opposite side of the right triangle is: " + bs);
        System.out.println("The big polygon perimeter is: " + bp);
        System.out.println("The big polygon average for pi is: " + bPI + "\n");
        System.out.println("The average for pi between the two polygons equals: " + Avg);
        System.out.println("                                   Actual pi value: 3.14159265359...");
    }
}
