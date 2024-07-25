package double_class;
class Num{
   private void m2(){
	System.out.println("This is non Excutable Class");
	System.out.println("Private");
	
	
	}  
}
class Run{
 public static void main(String[]args){
    Num n =new Num();
    	n.m2();
 }

}