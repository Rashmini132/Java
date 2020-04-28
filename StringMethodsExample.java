class StringMethodsExample{  
public static void main(String args[]){  
String s1 ="  jnit is good  ";  
String s2 = "JNIT";
String s3 = "organised";

System.out.println(s1.charAt(10));//returns the char value at the 10th index
System.out.println(s1.compareTo(s2)); // returns Ascii difference s1-s2
System.out.println(s1.concat(s2).concat(s3)); 
System.out.println(s1.contains("Hello")); // returns true if sequence of char values are found in this string otherwise returns false.
System.out.println(s1.endsWith("t"));  
System.out.println(s1.endsWith("good"));
System.out.println(s2.toLowerCase());
System.out.println(s1.equals(s2));
System.out.println(s1.trim());
System.out.println(s1.indexOf("is"));
System.out.println(s1.length());
                                                    
}}  