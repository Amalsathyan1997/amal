import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
class birthdate
{
public static void main(String args[])throws Exception
{
String y="07/12/1997";
Date s=new SimpleDateFormat("dd/MM/yyyy").parse(y);
System.out.println(y+" "+s);
}
} 