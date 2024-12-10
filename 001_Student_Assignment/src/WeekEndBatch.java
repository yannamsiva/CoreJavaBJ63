
public class WeekEndBatch extends Student {

	@Override
	public int calculateFee(String course) {
		// TODO Auto-generated method stub
		if(course.equals("java"))
		return 55000;
		else if(course.equals("Python"))
			return 35000;
		else
			return 25000;
	}

}
