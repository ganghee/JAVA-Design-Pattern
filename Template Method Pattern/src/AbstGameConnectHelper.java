//상위 객체를 만들고 템플릿 메소드를 구현한다.
//구현하려는 알고리즘이 일정한 프로세스가 있다. -> 보안, 인증, 권한, 연결 
//1. 알고리즘을 여러단계로 나누어 선언
//2. 알고리즘을 수행할 템플릿 메소드를 만든다.
//3. 나눠진 메소드들을 하위클래스에서 구현한다.

public abstract class AbstGameConnectHelper {
	
	protected abstract String doSecurity(String string);
	protected abstract boolean authentication(String id, String pw);
	protected abstract int authrization(String userName);
	protected abstract String connection(String info);
	
	//템플릿 메소드 
	public String requestConnection(String encodedInfo) {
		
		String decodeInfo = doSecurity(encodedInfo);
		
		String id = "i";
		String pw = "password";
		
		if(!authentication(id,pw)) {
			throw new Error("아이디 암호 불일치 ");
		}
		
		String userName = "userName";
		int i = authrization(userName);
		
		switch(i) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		default:
			break;
		}
		
		return connection(decodeInfo);
		
	}
}
