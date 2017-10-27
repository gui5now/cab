import java.util.Scanner;

public class Main {
    public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	double n1, n2, n3;
	n1=0;
	int n=0;
	n2=0;
	n3=0;
	for(n2=0; n2<6; n2++){
       n1=input.nextDouble();
          if (n1>0){
            n+=1;
            n3=n3+n1;
            }
            	
	}
	n3=(double) n3/ n;
	System.out.println(n+" valores positivos");
        System.out.println(n3);
    }
    
}