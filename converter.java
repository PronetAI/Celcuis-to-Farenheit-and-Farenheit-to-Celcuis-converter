import java.util.Scanner;
public class celcuis_farenheit {

	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    double c,f;
		    int choice;
		    do {
		    	System.out.println("1. Celcuis to Farenheit");
		    	System.out.println("2. Farenheit to Celcuis");
		    	System.out.println("Please enter in your choice (Enter 0 to exit)");
		    	choice=sc.nextInt();
		    	switch(choice){
		    	case 1 : System.out.println("Please enter the tempreture in celcuis");
		    	c=sc.nextDouble();
		    	f=(9/5)*c+32;
		    	System.out.println("Farenheit "+f); break;
		    	case 2 : System.out.println("Please enter the tempreture in farienheit");
		    	f=sc.nextDouble();
		    	c=((f-32)*5)/9;
		    	System.out.println("Celcuis "+c);
		    	}
		    } while(choice!=0);
	}
	}
