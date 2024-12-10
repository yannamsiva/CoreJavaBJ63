
public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastTrackBatchStudent ft=new FastTrackBatchStudent();
		ft.setSno(100);
		ft.setSname("shiva");
		ft.setMobileNumber(9985538462l);
		ft.setAddress("Hyd");
		ft.setCourse("java");
int sFee=		ft.calculateFee(ft.getCourse());

System.out.println(ft.getSno()+"\t"+ft.getSname()+"\t"+ft.getMobileNumber()+"\t"+ft.getAddress()+"\t"+ft.getCourse()+"\t"+sFee);



	}

}
