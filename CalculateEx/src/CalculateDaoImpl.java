
public class CalculateDaoImpl implements CalculateDao {

	@Override
	public void add(int fno, int sno) {
		// TODO Auto-generated method stub
		
		int result=fno+sno;
		System.out.println("Addition of Two Numbers :"+result);

	}

	@Override
	public void sub(int fno, int sno) {
		// TODO Auto-generated method stub
		int result=fno-sno;
		System.out.println("Subtraction of Two Numbers :"+result);

	}

	@Override
	public int mul(int fno, int sno) {
		// TODO Auto-generated method stub
		int result=fno*sno;
		return result;
	}

}
