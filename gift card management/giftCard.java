import java.util.*;
class giftCard{
	static Scanner scan = new Scanner(System.in);
	static ArrayList<customer> customers = new ArrayList<customer>();
	giftCard(){
		customer c0 = new customer(0,123,5000,"AAAA");
		customer c1 = new customer(1,122,2000,"BAAA");
		customer c2 = new customer(2,121,4000,"CAAA");
		customers.add(c0);
		customers.add(c1);
		customers.add(c2);
		System.out.println("size of cust "+customers.size());
	}
	static customer c;
	public static void start(){
		System.out.println("Enter customer id :");
		int cid = scan.nextInt();
		System.out.println("Enter customer password :");
		int pin = scan.nextInt();
		if(customers.get(cid).pass==pin){
			c = customers.get(cid);
			operation();
		}
		else{
			System.out.println("log in failed !!! ");
		}
	}
	public static void operation(){
		System.out.println("1.Create Gift Card ");
		System.out.println("2.Use Gift Card  ");
		System.out.println("3.Delete Gift Card ");
		System.out.println("4.View Gift Cards ");
		System.out.println("Enter your choice : ");
		int choice = scan.nextInt();
		switch(choice){
			case 1:{
				scan.nextLine();
				c.createGiftCard();
				operation();
				break;
			}
			case 2:{
				scan.nextLine();
				c.useGiftCard();
				operation();
				break;
			}
			case 3:{
				scan.nextLine();
				c.deleteGiftCard();
				operation();
				break;
			}
			case 4:{
				scan.nextLine();
				c.viewGiftCard();
				operation();
				break;
			}
		}
	}
	public static void main(String args[]){
		giftCard g = new giftCard();
		start();
	}
}