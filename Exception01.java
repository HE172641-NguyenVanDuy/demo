/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception01;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exception01 {
    
    public static void main(String[] args) {
        //testCharAt();
        test();
    }
    public static void test() {
        Scanner sc = new Scanner(System.in);
        int yob = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();
        
    }
    public static void slot4() {
        boolean cont = false;
        do {
            try {
                String s = " ";
                String pattern = String.format("SE%d%d%d", s);
                Scanner sc = new Scanner(System.in);
                
                System.out.println("Enter the string: ");
                s = sc.nextLine();
                if(! s.matches(pattern))
                    throw new Exception();
                System.out.println("The string is "+ s);
                cont = false;
            } catch (Exception e) {
                System.out.println("THe string is invalid");
                cont = true;
            }
        } while (cont);
    }
    public static void testCharAt() {
        String str = "Hello, world!";
Charset charset = Charset.forName("UTF-8"); // Specify the character encoding
byte[] byteArray = str.getBytes(charset);   // Convert the string into a sequence of bytes

System.out.println(Arrays.toString(byteArray)); // Output the byte array

    }
}
