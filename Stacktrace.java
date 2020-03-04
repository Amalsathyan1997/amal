package dfdf;

public class Stacktrace {
public static void main(String[] a) {
	try {
		y();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}
static void y() {z();}
static void z() {
	int p=45/0;
}
}