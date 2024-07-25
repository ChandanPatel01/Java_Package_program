class Temp{
         int x;
		 static int y;
}
 class Done{
     public static void main(String args[])
	 {
	      Temp temp =new Temp();
		  System.out.println("This is default  value of non static:" + temp.x);
		     System.out.println("This is default  value of  static:" + Temp.y);
	 }
 }