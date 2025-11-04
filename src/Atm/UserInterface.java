package Atm;

import java.util.Scanner;

public class UserInterface {
private static int status;
	public static void main(String[] args) {
		AtmOperationImple imp1=new AtmOperationImple();
		Scanner sc=new Scanner(System.in);
		int atmnumber=123456;
		int atmpin=123;
		System.out.println(">>>>>>>>>WELCOME TO ATM MACHINE<<<<<<<<<<");
		System.out.println("ENTER  THE ATM NUMBER");
		int atmnum2=sc.nextInt();
		System.out.println("ENTER  THE  ATM PIN ");
		int atmpin2=sc.nextInt();
		
		if(atmnumber== atmnum2 && atmpin==atmpin2) {
			while(true) {
		System.out.println("1.viewAvailable Balance\n 2.withdrawAmount \n 3.DepositAmount \n 4.viewMinistatement \n 5.exit");
			System.out.println("enter your choice:");
			int ch=sc.nextInt();
			if(ch==1) {
				imp1.viewBalance();
			} else if(ch==2) {
				System.out.println("Enter the amount to withdraw");
				double withdrawamount=sc.nextDouble();
				imp1.withdrawAmount(withdrawamount);
			}
			else if(ch==3) {
				System.out.println("Enter the amount to deposit");
				double depositAmount=sc.nextDouble();
				imp1.dipositAmount(depositAmount);
			}else if(ch==4){
				imp1.viewMiniStatement();
			}
			else if(ch==5) {
				System.out.println("Collect yout ATM Card \n and  Thank you");
				System.exit(status);
			}
			
			}
		}
		else {
			System.out.println("INCORRECT ATM NUMBER");
		}
	
		
	}

}
