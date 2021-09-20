/*
Maurzel Castleberry
Due Date: 09/19 | CS232
This program will get ten numbers in which range from one to 100 from a user
and print out the smallest, largest and the average through an if statement.
 */
package lab4java;

import java.util.Scanner;

public class Lab4Java {

 
    public static void main(String[] args) {

Scanner Input = new Scanner(System.in);
//DECLARATIONS AND WELCOMING MESSAGE//
int num;
int smallest;
int largest;
int sum = 0;
double avg = 0;

System.out.println("Enter ten integers between 1 and 100, and I will tell you the smallest,the largest, and the average: \n");

smallest=101;
largest=1;
//FINDS THE SMALLEST, LARGEST AND AVERAGE//
for  (int i=0;i<10;i++){ 
num = Input.nextInt();
if (num < 1 || num > 100)
{
    System.out.println(" You have entered an invalid input. Please try again.");
    num = Input.nextInt();
}
else if (num < smallest){
    smallest = num;
}

else if (num > largest){
    largest = num;
}
sum+=num; 
avg =  (double)sum / 10;
}

//PRINTS THE RESULTS//
System.out.println("Smallest: "+smallest+"\n");
System.out.println("Largest: "+largest+"\n");
System.out.println("Average: "+avg+"\n");
	
}   
       
    }
    

