package operators;

public class RelationalOperators {
	public static void main(String[] args) {

		int x=10;
		int y=20;

		System.out.println(x>y);//==>false
		System.out.println(x<y);//==>true
		System.out.println(x>=y);//==>false
		System.out.println(x<=y);//==>true
		System.out.println(x==y);//==>false
		System.out.println(x!=y);//true

		System.out.println("------------------------------------"
				+"------------------------");
		int x1=100;
		int y1=90;

		System.out.println(x1>y1);//==>true
		System.out.println(x1<y1);//==>false
		System.out.println(x1>=y1);//==>true
		System.out.println(x1<=y1);//==>false
		System.out.println(x1==y1);//==>false
		System.out.println(x1!=y1);//==>true
	}

}
