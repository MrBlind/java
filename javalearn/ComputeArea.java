import java.util.Scanner;

public class ComputeArea
{
    // to do
    public static void main(String[] args)
    {
        //step 1: Read in radius
        double radius;    //declare radius
	double area;	  //declare area

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
	//assign a radius
	//radius = 20;
	radius = input.nextDouble();

	//step 2: Compute area
	area = radius * radius * 3.14159;
	
	//step 3: Display the area
	System.out.println("The area for the circle of radius "
	+ radius + " is " + area);
    }
}
