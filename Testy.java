package assignment;
import java.io.*;
class Testy {
	public static void main(String args[])
	{
		try
		{
			File f=new File("pw3.java");
			FileReader fin=new FileReader(new File("pwd1.txt"));
			FileWriter fout=new FileWriter(f);
			int i=0;
			while((i=fin.read())!=-1)
			{
				fout.write(i);
			}
			fout.close();
		}catch(Exception e) {}
	}

}
