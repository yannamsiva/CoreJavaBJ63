import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {

	public static void main(String[] args) throws FileNotFoundException {

		// TODO Auto-generated method stub

		PrintWriter pw=new PrintWriter("shiva.txt");
		
		pw.println("Welcome Boss");
		pw.write("what magic Sir Ji");
		pw.println();
		pw.println(100);
pw.flush();
	}

}
