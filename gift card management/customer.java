import java.util.*;
class customer{
	int id;
	int pass;
	double balance;
	String name;
	ArrayList<giftC> giftScard = new ArrayList<giftC>();
	Scanner scan = new Scanner(System.in);
	customer(int id,int pass,double balance,String name){
		this.id=id;
		this.pass=pass;
		this.balance=balance;
		this.name=name;
		this.giftScard=giftScard;
	}
	public void createGiftCard(){
		scan.nextLine();
		System.out.println("Your gift card id is :"+giftScard.size());
		int gid=giftScard.size();
		System.out.println("Enter gift card pin :");
		int pin = scan.nextInt();
		System.out.println("Enter amount for gift card :");
		double worth= scan.nextDouble();
		while(worth>balance){
			System.out.println("not sufficient balance for gift card");
			System.out.println("your Blance is :"+balance);
			System.out.println("Enter amount for gift card :");
			worth= scan.nextDouble();
		}
		balance-=worth;
		giftScard.add(new giftC(id,gid,pin,worth));
	}
	public void deleteGiftCard(){
		if(giftScard.size()!=0){
			System.out.println("Enter gift card id : ");
			int gid=scan.nextInt();
			System.out.println("Enter gift card pin :");
			int pin = scan.nextInt();
			if(giftScard.get(gid).pin==pin){
				balance+=giftScard.get(gid).worth;
				giftScard.remove(gid);
			 }
			else{
				System.out.println("There is NO gift card with id "+gid);
			}
		}
		else{
				System.out.println("There is NO gift card in this account");
		}
	}
		
	public void useGiftCard(){
		System.out.println("Enter gift card id :");
		int gid=scan.nextInt();
		System.out.println("Enter gift card pin :");
		int pin = scan.nextInt();
		System.out.println("Enter price of item :");
		double worth= scan.nextDouble();
		while(worth>giftScard.get(gid).worth){
			System.out.println("not sufficient balance from gift card");
			System.out.println("your gift card worth is :"+giftScard.get(gid).worth);
			System.out.println("Enter price of item :");
			worth= scan.nextDouble();
		}
		giftScard.get(gid).worth-=worth;
		System.out.println("---NOW your gift card worth is :"+giftScard.get(gid).worth);
	}
	public void viewGiftCard(){
		scan.nextLine();
		if(giftScard.size()!=0)
		for(giftC gc:giftScard){
			System.out.println("your gift card id "+gc.Gid);
		}
		else{
			System.out.println("There is no gift cards!!!");
		}
	}
}