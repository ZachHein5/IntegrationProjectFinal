import java.util.Scanner;


public class Main9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        String cap = A.substring(0, 1).toUpperCase() + A.substring(1);
        String cap2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(cap + " " + cap2);

	}

}
