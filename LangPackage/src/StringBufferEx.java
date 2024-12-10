
public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//StringBuffer sb=new StringBuffer();
		StringBuilder sb=new StringBuilder();
System.out.println(sb.capacity());
sb.append("abcdefghijklmnopq");
System.out.println(sb.capacity());
System.out.println(sb.length());

System.out.println(sb.charAt(0));
System.out.println(sb);

sb.insert(0, "siva");
System.out.println(sb);
sb.delete(0, 4);
System.out.println(sb);
sb.deleteCharAt(0);
System.out.println(sb);
sb.ensureCapacity(2000);
System.out.println(sb.capacity());
System.out.println(sb.length());
sb.trimToSize();
System.out.println(sb.capacity());
System.out.println(sb.length());


StringBuffer sb1=new StringBuffer("siva");
System.out.println(sb1.capacity());
for(int i=0;i<20;++i)
{
	sb1.append(i);
}
System.out.println(sb1.capacity());


	}

}
