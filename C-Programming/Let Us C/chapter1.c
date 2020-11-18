//Chapter one
//program to calculate basic gross salary
#include <stdio.h>
int main(){
	int salary;
	int dearness;
	int rent;

	int grossSalary;

	printf("Enter Ramesh's basic salary:\n");
	scanf("%d", &salary);

	dearness = 0.4 * salary;
	rent = 0.2 * salary;

	//Gross pay is eaul to sum of basic pay + all allowances
	grossSalary = salary + dearness + rent; 

	printf("The gross salary of Ramesh is %d\n", grossSalary);

	return 0;

}

//To calculate distance in meter, inches and centimeter
#include <stdio.h>
int main(){
	int dist;

	printf("Enter distance in KM:\n");
	scanf("%d", &dist);

	int distM = dist * 1000;
	int distCM = distM * 100;
	int distI = distCM/2.54;
	int distF = distI/12;
	printf("The distance %d KM is equal to %d M\n",dist, distM );
	printf("The distance %d KM is equal to %d CM\n",dist, distCM );
	printf("The distance %d KM is equal to %d Inches\n",dist, distI );
	printf("The distance %d KM is equal to %d Feet\n",dist, distF );

}

//To find average and percentage of marks
#include <stdio.h>
int main()
{
	int m1,m2,m3,m4,m5;
	printf("Enter Your Marks:\n");
	scanf("%d %d %d %d %d\n", &m1, &m2, &m3, &m4, &m5);

	int average = m1 + m2 + m3 + m4 + m5;
	float percentage = average/5;

	printf("The average is %d\n", average );
	printf("The percentage is %f\n", percentage);
}

//To convert temperature to Centigrade Degrees
#include <stdio.h>
int main(){
	float temp_F;
	printf("Enter temperature in Ferenheit:\n");
	scanf("%f", &temp_F);

	float temp_D = (temp_F - 32)/1.8;
	printf("temperature in Degree celcius is %f\n",temp_D);
}

//To calculate area and perimeter of the rectangle 
//To calculate area and circumference of circle
#include<stdio.h>
int main(){
	int length;
	int breadth;
	int radius;


	printf("Enter length and breadth of rectangle:\n");
	scanf("%d %d", &length, &breadth);

	printf("Enter radius of a circle: \n");
	scanf("%d", &radius);

	float area = length * breadth;
	printf("The area of the rectangle is %f\n",area);

	int perimeter = 2*length + 2*breadth;
	printf("The perimeter of the rectangle is %d\n", perimeter );

	float area1 = 3.14 * radius*radius;
	float circumference = 2*3.14 * radius;
	printf("The area of circle is %f\n",area1);
	printf("The circumference of circle is %f\n", circumference );

	return 0;
}

