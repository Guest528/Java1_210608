package pk3;
//Java version 10 �̻�
public class TypeInference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		var j=10.0;      //double j=10.0;
		var str="hello"; //String str="hello";
		
		i=100;
		str="test";
		j=10.5;
		//ste=3; Type Error(10������ ���ڷ� ����, �ѹ� ����� type�� ���� �Ұ�)		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
	}

}
