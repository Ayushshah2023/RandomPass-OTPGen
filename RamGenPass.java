
package ramgenpass;
import java.util.*;
/*import java.util.*;
public class RamGenPass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of password");
        int a = s.nextInt();
        char [] q = new char[a];
        System.out.println("Enter the how many letters");
        int b = s.nextInt();
        System.out.println("Enter the numbers");
        int c = s.nextInt();
        System.out.println("Enter the numbers of symbols");
        int d = s.nextInt();
        for(int i=0;i<a;i++)
        {
             double rnd = Math.random();
            if(b>=0)
            {
                q[i] += ('a' + rnd*('z'-'a'+1));
                b--;
            }
            if(c>=0)
            {
                q[i] += ('0' + rnd*('9'-'0'+1));
                c--;
            }
            if(d>=0)
            {
                q[i] += ('<' + rnd*('@'-'<'+1));
                d--;
            }
        }
        for(int i=0;i<a;i++)
        {
            System.out.print(q[i]);
        }
    }
    
}
*/
import java.util.*; 
  
public class RamGenPass 
{ 
    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of len of password");
        int n= s.nextInt();
        int length = n; 
        geek_Password(length); 
    }  
    static void geek_Password(int len) 
    { 
        System.out.println("Generating password using random() : "); 
        System.out.print("Your new password is : ");  
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        String Small_chars = "abcdefghijklmnopqrstuvwxyz"; 
        String numbers = "0123456789"; 
        String symbols = "!@#$%^&*_=+-/.?<>)"; 
        String values = Capital_chars + Small_chars + numbers + symbols; 
        Random rndm_method = new Random(); 
  
        char[] password = new char[len]; 
  
        for (int i = 0; i < len; i++) 
        { 
            password[i] = values.charAt(rndm_method.nextInt(values.length())); 
        }
        String str = new String(password);
        System.out.println(str);
    } 
}