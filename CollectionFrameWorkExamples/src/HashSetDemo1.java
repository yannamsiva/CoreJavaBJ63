import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product pro=new Product(1,"tv","10",250);

Product pro1=new Product(3,"Ac","10",2500);

Product pro2=new Product(2,"Cooler","10",2050);

Product pro3=new Product(5,"mobile","10",2500);

HashSet<Product>addProducts=new HashSet<>();
addProducts.add(pro);
addProducts.add(pro1);
addProducts.add(pro2);
addProducts.add(pro3);

System.out.println("Enter Product Id");
Scanner sc=new Scanner(System.in);
int id=sc.nextInt();
for(Product p : addProducts)
{
	if(p.getPid()==id)
	{
		System.out.println(p.getPid()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty());
	}

}






	}

}
