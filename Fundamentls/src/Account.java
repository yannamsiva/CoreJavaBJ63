
public class Account {
	
	int accNo;
	String accName;
	
	void changeDetails()
	{
		accNo=1001;
		accName="Savings";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account acc=new Account();
System.out.println(acc.accName+"\t"+acc.accNo);
acc.changeDetails();
System.out.println(acc.accName+"\t"+acc.accNo);

Account acc1=new Account();
acc.changeDetails();
acc.accNo=1002;
acc.accName="Current";
System.out.println(acc.accName+"\t"+acc.accNo);//Current  1002
System.out.println(acc1.accName+"\t"+acc1.accNo);//null 0
acc1.changeDetails();
System.out.println(acc1.accName+"\t"+acc1.accNo);//Savings 1001

	}

}
