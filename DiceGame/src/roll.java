import java.util.Random;
import java.util.Scanner;
public class roll {
static String userName;
static int money;
static Random random = new Random();
static Scanner in = new Scanner(System.in);

public static void main (String[] args) {
	System.out.println("Enter your username");
	userName=in.nextLine();
	System.out.println("Hello "+userName+"!");
	money=1000;
	System.out.println("You have "+"$"+money);
	System.out.println("Try and get over $20,000");
	rollDice();
}
public static void rollDice() {
	if(money<=0||money>20000) {
		if(money<=0) {
		System.out.println("You have no money left!");
		return;
		}
		if(money>20000) {
		System.out.println("Congrats u won!");
		System.out.println(money);
		return;
		}
	}
	System.out.println("How much would you like to bet?");
	int bet = in.nextInt();
	
	if(bet>money) {
		System.out.println("You dont have that much money, try betting again!");
		System.out.println("How much would you like to bet?");
		bet = in.nextInt();
		in.nextLine();
		
	}
	
	System.out.println("What number are you betting on? (1-6)");
	int right = random.nextInt(6)+1;
	int number = in.nextInt();
	
	
	
	if(number==right) {
		System.out.println("You got it right!");
		money+=bet*6;
		System.out.println("You won "+ bet);
		System.out.println("You now have "+"$"+money);

		rollDice();
	}
	else {
		System.out.println("You got it wrong!");
		money-=bet;
		System.out.println("You now have "+"$"+money);
		rollDice();
	}
	
}
}