import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pro=new Product(1,"tv","10",250);

		Product pro1=new Product(3,"Ac","10",2500);

		Product pro2=new Product(2,"Cooler","10",2050);

		Product pro3=new Product(5,"mobile","10",2500);
		
		TreeSet<Product> tr=new TreeSet<>(new Product());
		tr.add(pro);
		tr.add(pro1);
		tr.add(pro2);
		tr.add(pro3);
		System.out.println(tr);
		for(Product p : tr)
		{
			System.out.println(p.getPid()+"\t"+p.getPname()+"\t"+p.getQty()+"\t"+p.getPrice());
		}
		
		
		
		
		
		
	}

}
