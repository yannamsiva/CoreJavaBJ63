import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
try {
	 fr=new FileReader("shiva.txt");
	int i;
	while((i=fr.read())!=-1)
	{
		System.out.println((char)i);
	}
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

finally
{
	try {
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


	}

}
