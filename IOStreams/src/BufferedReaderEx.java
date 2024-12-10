import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
BufferedReader br=new BufferedReader(new FileReader("shiva.txt"));


String line = br.readLine();

while(line!=null)
{
	System.out.println(line);
	line=br.readLine();
}

br.close();

	}

}
