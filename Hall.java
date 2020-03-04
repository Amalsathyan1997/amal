package house;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileDescriptor;
import java.util.*;
public class Hall {
	public static void main(String[] args) {
		PrintStream myout=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myout.print("This is the first room while entering the house.");
		/* ystem.out.write("text".getBytes());
		System.out.format("%s","text");
		System.err.println("text");
		System.console().writer().println("text");*/
	}

}
