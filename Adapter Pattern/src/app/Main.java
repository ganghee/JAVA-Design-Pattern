package app;

//Math는 자료형이 Double 이다
//Adapter는 자료형이 Float 이다
//두 개의 체를 연결 하려면 adapter가 필요하다

public class Main {
	public static void main(String[] args) {
		Adapter adapter = new AdapterImpl();
		
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(100f));
	}
}
