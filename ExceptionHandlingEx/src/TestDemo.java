
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//throw an object of userDefined exception
		
		try {
			throw new UserDefinedException("This is userdefined Exception");
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
