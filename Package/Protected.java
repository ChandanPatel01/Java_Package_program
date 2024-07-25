package protected_pack;
class Protected {
    protected void pro(){
	     System.out.println("Hello , this is Protected class");
	}
   public static void main(String[] args){
        Protected p=new Protected();
		     p.pro();
   }
}