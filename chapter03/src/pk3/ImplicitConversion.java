package pk3;

public class ImplicitConversion {

	public static void main(String[] args) {

		//묵시적 형변환
		byte bNum=10;
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		float fNum=iNum2;  //정밀도가 높은쪽으로 맞춰짐
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum=fNum+iNum;
		System.out.println(dNum);
		
	}

}
