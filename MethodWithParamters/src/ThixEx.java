
public class ThixEx {

	int x=1000;
	int y=9000;
	static int k=90;
	int b=80;
	void funX(int x,int y)
	{
		System.out.println("Before this KeyWord");
		System.out.println(x+"\t"+y+"\t"+k+"\t"+b);
		System.out.println("After Using this KeyWord");
		System.out.println(this.x+"\t"+this.y+"\t"+this.k+"\t"+this.b);
		System.out.println(this.x+"\t"+this.y+"\t"+k+"\t"+b);

	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThixEx demo=new ThixEx();
		demo.funX(500,600);
	}

}
