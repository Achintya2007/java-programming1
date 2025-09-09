import java.util.Scanner;

 class Addition
{
	public static void main(String[] args){
       int a,b,c,add;
       System.out.println("enter the three value for addition");
       Scanner obj1= new Scanner(System.in);
       a=obj1.nextInt();
       b=obj1.nextInt();
       c=obj1.nextInt();
       add=a+b+c;
       System.out.println("add="+add);
	}
}
