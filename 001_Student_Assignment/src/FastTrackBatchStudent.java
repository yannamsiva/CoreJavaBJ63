
public class FastTrackBatchStudent extends Student {

	@Override
	public int calculateFee(String course) {
		// TODO Auto-generated method stub
		if(course.equals("java"))
		return 35000;
		else if(course.equals("Python"))
			return 25000;
		else
			return 15000;
	}

}
