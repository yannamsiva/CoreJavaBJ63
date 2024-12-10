import java.util.Comparator;

public class Product implements Comparable<Product>,Comparator<Product>{
	
	private int pid;
	private String pname;
	private String qty;
	private int price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int pid, String pname, String qty, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		if(o.pid>pid)
			return -1;
		else if(o.pid<pid)
			return +1;
		else
		return 0;
	}
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.pid==o2.pid)
			return 0;
		else if(o1.pid<o2.pid)
			return 1;
		else
			return -1;
		//return o2.compareTo(o1);
	}

	
	

}
