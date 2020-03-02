//Created by: christian briglio 

//Created on: Mar.1

// Unit 1-07

// Mr. O'hara (ICS4U)



// This program tells you the height given a chosen length and width.



import java.util.Scanner;  // Import the Scanner class



class Height {

  

  public static void main(String[] args) {



    // Variables

    //double firstD;

    double secondD;

    double ans;



    

    Scanner dim = new Scanner(System.in); 

    System.out.println("Enter the dimension you are looking for (height - lenght - width)");
    String dimension = dim.nextLine();
    System.out.println("The dimension of : " + dimension + " is " + ans);  // Output user input
    

    
    double firstD;
    Scanner first = new Scanner(System.in);

    System.out.println("Enter the first dimension of your object");

    firstD = first.nextDouble();



    double secondD;
    Scanner second = new Scanner(System.in);

    System.out.println("Enter the second dimension of your object");

    secondD = second.nextDouble();


    double ans;
    ans = 144 / (firstD * secondD);



    System.out.println("The dimension of : " + dimension + " is " + ans);  // Output user input

  }

}

