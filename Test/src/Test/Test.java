package Test;

public class Test {
	public static void main(String[] args) {
		for(int i = 0;i<=10;i++) {
			System.out.println(add(i));
		}
	}
	public static int add(int a) {
		if(a==1) {
			return a;
		}else if(a==0){
			return a;
		}else {
			return add(a-2)+add(a-1);
		}
	}
}
