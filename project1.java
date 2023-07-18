public class rev_string {
	
	public static void main (String[] args) {
	       
      String str= "Infoway Technologies", rstr="";
      char ch;
       
      System.out.println("Original String: "+str);
    
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        rstr= ch+rstr;
      }
      System.out.println("Reversed String: "+ rstr);
    }
	 

}