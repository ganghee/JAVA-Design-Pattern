//하위 객체에서 구체적인 코드를 구현한다.
public class DefaultGameConnectHelper extends AbstGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("디코드 ");
		return string;
	}

	@Override
	protected boolean authentication(String id, String pw) {
		System.out.println("아이디 비밀번호 확인 ");
		return true;
	}

	@Override
	protected int authrization(String userName) {
		System.out.println("권한 확인 ");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속단계 ");
		return null;
	}

}
