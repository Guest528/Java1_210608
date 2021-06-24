package pk3;

public class ExplicitConversion {

	public static void main(String[] args) {

		//명시적 형변환
		int iNum=1000;  //32bit
		byte bNum=(byte)iNum; //8bit 범위가 넘어가면 숫자가 잘림
		
        System.out.println(iNum);
		System.out.println(bNum);
		
		
		double dNum1=1.2;
		float fNum1=0.9F;
		
		int iNum2=(int)(dNum1+fNum1);    // 2.1 -> 2
		int iNum3=(int)dNum1+(int)fNum1; // 1+0 = 1
		System.out.println(iNum2);
		System.out.println(iNum3);

	}

}
