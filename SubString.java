package rukmani;

public class SubString {
    public static void main(String[] args) {
 	   
String s1 ="Mahatma Karamchad Gandhi";
String s2 ="";
s2  = s1.charAt(0)+ ".";  // M.
System.out.print(s2);

int pos = s1.indexOf(' ');

s2 =s1.charAt(pos +1)+ "."; // M.K.      
int l = s1.lastIndexOf(' ');

String ls = s1.substring( l + 1);
s2 = s2+ls;                      // M.K.Gandhi

System.out.print(s2);
}
}

