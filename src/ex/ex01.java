package ex;
/*
 * Date: 2016/11/14
 * Author: 1050210XX OOO
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(fun(n));}
		public static int fun(int x){
		if(x == 1){
			return x;
		}else{
		return x*fun(x-1);
		        }
	}
}
