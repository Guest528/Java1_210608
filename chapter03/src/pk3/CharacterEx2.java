package pk3;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		//int a=65; //�빮�� A ASCII�빮��A �ҹ���a ���� �ܿ��δ°� ����
		int a=97; //�ҹ��� a
		System.out.println(a);
		System.out.println((char)a); //����ȯ(to ASCII Code)
		
		System.out.println("============");
		//int�� char�� ȣȯ�� ����������, ������ ȣȯ���� �ʴ´�
		int b=-66; //error
		System.out.println(b);
		System.out.println((char)b);
		
		System.out.println("============");
		
		char a2=65; //�ƽ�Ű �ڵ�� ��ȯ ����
//		char a2=-65; ������ �ƽ�Ű �ڵ忡 �����Ƿ� ��ȯ �Ұ�
		
		System.out.println(a2);
		System.out.println((int)a2);
	}

}
