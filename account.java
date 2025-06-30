import java.util.*;
public class account {
	int balance=0;
	List<String> history = new ArrayList<>();
	account()
	{
		System.out.println("the available balance is"+balance);
	}
	void deposit(int deposit) {
		 this.balance+=deposit;
		System.out.println("amount deposited sucessfully  :"+deposit);
		 history.add("Deposited: " + deposit + " | Balance: " + balance);
	}
	void withdraw(int withdraw) {
		if(withdraw>balance) {
			System.out.println("the insufficent funds  "+balance);
			history.add("Failed Withdraw: " + withdraw + " | Balance: " + balance);
		}
			else {
				this.balance-=withdraw;
				System.out.println("withdraw sucessfully  :"+withdraw);
				history.add("Withdrew: " + withdraw + " | Balance: " + balance);
			}
		}
	void Balance() {
	    System.out.println("Current balance: " + balance);
	}
	void showHistory() {
        System.out.println("\n--- Transaction History ---");
        if (history.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String record : history) {
                System.out.println(record);
            }
        }
    }

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int ab=0;
		account abc=new account();
		for(ab=0;ab!=5;) {
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		System.out.println("3.balance");
		System.out.println("4.transaction history");
		System.out.println("5.exit");
		System.out.println("enter your choice");
		 ab=sc.nextInt();
		
		if(ab==1) {
			System.out.println("enter the amount to be deposited");
			int a=sc.nextInt();
			abc.deposit(a);
		}
		else if(ab==2) {
			System.out.println("enter the amount to be withdraw");
			int b=sc.nextInt();
			abc.withdraw(b);
		}
		else if(ab==3) {
			abc.Balance();
		}
		else if(ab==5){
			System.out.println("exiting transaction bye");
		}
		else if(ab==4) {
			abc.showHistory();
			
		}
		else {
			System.out.println("invalid choice");
		}
		}
	}

}
