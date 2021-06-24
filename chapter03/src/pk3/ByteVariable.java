package pk3;

public class ByteVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bs1=127; //bs=bytesize
		              //8bit -128~128
		byte bs2=127; //할당수치를 넘어가면 에러남, 에러도 확인요망
		short s=-32768; //16bit -32768 ~ 32767
		
		System.out.println(bs1);
		System.out.println(bs2);
		System.out.println(s);
		
	}

}
