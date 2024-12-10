import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter fw=null;
try {
	fw=new BufferedWriter(new FileWriter("shiva.txt"));
	fw.write("welcome Rani");
	fw.newLine();
	fw.write('c');
	fw.newLine();
	char ch[]= {'a','b','d'};
	
	fw.write(ch);
	fw.newLine();
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

finally
{
	try {
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	}

}
