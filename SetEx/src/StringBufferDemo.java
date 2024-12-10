
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16
		System.out.println(sb.length());//
		
		sb.append("abcdefghijklmnopq");
		System.out.println(sb.capacity());
		
		sb.insert(0, "rani");
		System.out.println(sb);
		sb.delete(0,4);
		System.out.println(sb);
		
	}

}


