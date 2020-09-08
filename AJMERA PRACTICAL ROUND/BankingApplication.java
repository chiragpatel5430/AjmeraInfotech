import java.util.*;
import java.time.*;
import java.util.Date;
import java.text.*;

class Account
{
	int balance;
	ArrayList<String> debit = new ArrayList<>();
	ArrayList<String> credit = new ArrayList<>();
	
	// this function for extrace money from Account
	
	
	public void extractMoney(int val)
	{
		// checking the value it is negatibve or not
		if(val<=0)
		{
			System.out.println("Enter the Positive Value greater than zero");
			return;
		}
		
		// checking the condition money is multiple of 500 or not
		if(val%500!=0)
		{
			System.out.println("YOu must have to enter the value in the multiple of 500.");
			System.out.println("");
			return;
		}
		// checking the condition is extract value is less than or equal to balance or not
		if(val<=balance)
		{
			balance -= val;
			
			// conversion of date format to string formate using formatter
			
			Date date = new Date();
			SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyy");
			String s1 = formater.format(date);
			debit.add(s1+" Debit "+val);
			System.out.println("Your Withdraw of "+val+" is successful.");
			System.out.println("");
		}
		else
		{
			System.out.println("Insufficient Balance.");
			System.out.println("");
			return;
		}
	}
	
	// this function is for add money to the account
	
	public void addMoney(int add)
	{
		// checking the value it is negatibve or not
		if(add<=0)
		{
			System.out.println("Enter the Positive Value greater than zero");
			return;
		}
		
		// checking the condition money is multiple of 500 or not
		
		if(add%500!=0)
		{
			System.out.println("You must have to enter the value in the multiple of 500.");
			System.out.println("");
			return;
		}
		
		// is upper condition is true than simply add the value in balance
		
		balance += add;
		
		// conversion of date to string
		Date date = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyy");
		String s1 = formater.format(date);
		credit.add(s1+" credit "+add);
		System.out.println("Your Rs "+add+" is successfully Added in Account.");
		System.out.println("");
	}
	
	// this function prints the history of debit transaction
	
	public void historyDebit()
	{
		if(debit.size()==0)
		{
			// if there is no transaction in history
			System.out.println("There is no Transactionof Debit uptil Now ...!");
			System.out.println("");
			return;
		}
		else
		{
			
			//printing of transaction
			System.out.println("Your Transaction History Of debit");
			int n = debit.size();
			for(int i=0;i<n;i++)
				System.out.println(debit.get(i));
			
			System.out.println("Final Balance "+balance);
			
			System.out.println("");
		}
	}
	
	public void historyCreit()
	{
		// if there is no transaction in history
		if(credit.size()==0)
		{
			System.out.println("There is no Transactionof Credit uptil Now ...!");
			System.out.println("");
			return;
		}
		else
		{//printing of transaction
			System.out.println("Your Transaction History Of credit");
			int n = credit.size();
			for(int i=0;i<n;i++)
				System.out.println(credit.get(i));
			
			System.out.println("Final Balance "+balance);
			System.out.println("");
		}
	}
	// this funtion check the balance in the account
	
	public void checkBalance()
	{
		System.out.println("Your Balance is "+balance);
		System.out.println("");
	}
	
}


class CheckingAccount extends Account
{
	public CheckingAccount(int balance)
	{
		this.balance = balance;
	}
	// this method is for run the all transaction
	public void runTransaction()
	{
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		while(flag==0)
		{
			System.out.println("Enter The Choice for checking account: ");
			System.out.println("1. Extract Money");
			System.out.println("2. Add Money");
			System.out.println("3. Show Debit History");
			System.out.println("4. Show Creit History");
			System.out.println("5. Show Balance");
			System.out.println("6. Exit");
			System.out.println("");
			
			int varibale = sc.nextInt();
			
			switch(varibale)
			{
				case 1:
					System.out.println("Enter the Amount Which You Want TO Extrace in the Multiple Of 500.");
					System.out.println("");
					int val1 = sc.nextInt();

					extractMoney(val1);
					break;
				case 2:
					System.out.println("Enter the Amount Which You Want TO add in the Multiple Of 500.");
					System.out.println("");
					int val2 = sc.nextInt();
					addMoney(val2);
					break;
				case 3:
					historyDebit();
					break;
				case 4:
					historyCreit();
					break;
				case 6:
					flag = 1;
					break;
				case 5:
					checkBalance();
					break;
				default :
					System.out.println("Please Enter a valid Number");
					System.out.println("");
					break;
			}
			
			if(flag==1)
			{
				System.out.println("Thank You !!!");
				System.out.println("");
				break;
			}
			
		}
	}
	
		
}
	
class SavingsAccount extends Account
{
	
	public SavingsAccount(int balance)
	{
		this.balance = balance;
	}
	// this method is for run the all transaction
	
	public void runTransaction()
	{
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		while(flag==0)
		{
			System.out.println("Enter The Choice for saving account: ");
			System.out.println("1. Extract Money");
			System.out.println("2. Add Money");
			System.out.println("3. Show Debit History");
			System.out.println("4. Show Creit History");
			System.out.println("5. Show Balance");
			System.out.println("6. Exit");
			
			
			
			int varibale = sc.nextInt();
			
			switch(varibale)
			{
				case 1:
					System.out.println("Enter the Amount Which You Want TO Extrace in the Multiple Of 500.");
					System.out.println("");
					int val1 = sc.nextInt();
					extractMoney(val1);
					break;
				case 2:
					System.out.println("Enter the Amount Which You Want TO add in the Multiple Of 500.");
					System.out.println("");
					int val2 = sc.nextInt();
					addMoney(val2);
					break;
				case 3:
					historyDebit();
					break;
				case 4:
					historyCreit();
					break;
				case 6:
					flag = 1;
					break;
				case 5:
					checkBalance();
					break;
				default :
					System.out.println("Please Enter a valid Number");
					System.out.println("");
					break;
			}
			
			if(flag==1)
			{
				System.out.println("Thank You !!!");
				System.out.println("");
				break;
			}
			
		}
	}
	
	
}

	

public class BankingApplication
{
	public static void main(String[] args)
	{
		// this is the main code 
		Scanner sc = new Scanner(System.in);
		// v=creating objcect for both account
		SavingsAccount sa = new SavingsAccount(10000);
		CheckingAccount ca = new CheckingAccount(10000);
		
		System.out.println("Welcone to Banking Application !!!");
		System.out.println("");
		int flag = 0;
		while(flag==0)
		{
		
			System.out.println("Enter The Choice for perfoming operation on Checking Accout or Sasving Accunt: ");
			System.out.println("1. Saving Account");
			System.out.println("2. Checking Account");
			System.out.println("3. Exit");
			System.out.println("");
			int var = sc.nextInt();
			
			switch (var)
			{
				case 1:
					sa.runTransaction();
					break;
				case 2:
					ca.runTransaction();
					break;
				case 3:
					flag = 1;
					break;
				default :
					System.out.println("Enter a valid Option");
					System.out.println("");
					break;
			}
			
			if(flag==1)
			{
				System.out.println("Thank you");
				System.out.println("");
				break;
			}
		}
		
	}
}