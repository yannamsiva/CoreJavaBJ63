
public class Test implements Cloneable{

	int i=100;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
Test t=new Test();

Test t1=(Test)t.clone();//Deep Cloning

System.out.println(t.i+"\t"+t1.i);

t.i=6000;
System.out.println(t.i+"\t"+t1.i);


Test t2=t;//Shallow Cloning

System.out.println(t.i+"\t"+t2.i);




	}

}
