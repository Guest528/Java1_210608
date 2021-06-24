package pk3;

public class CharacterEx2 {

	public static void main(String[] args) {
		
		//int a=65; //대문자 A ASCII대문자A 소문자a 값은 외워두는게 좋음
		int a=97; //소문자 a
		System.out.println(a);
		System.out.println((char)a); //형변환(to ASCII Code)
		
		System.out.println("============");
		//int와 char는 호환이 가능하지만, 음수는 호환되지 않는다
		int b=-66; //error
		System.out.println(b);
		System.out.println((char)b);
		
		System.out.println("============");
		
		char a2=65; //아스키 코드라 변환 가능
//		char a2=-65; 음수는 아스키 코드에 없으므로 전환 불가
		
		System.out.println(a2);
		System.out.println((int)a2);
	}

}
