import concrete.HpCreator;
import concrete.MpCreator;
import framework.Item;
import framework.ItemCreator;

//item 생성을 하위 객체인 MpCreator 또는 HpCreator 에서 생성 
// 객체 생성을 하위 객체에서 생성하는 것이다 
public class Main {
	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		item.use();
		
		creator = new MpCreator();
		item = creator.create();
		item.use();
	}
}
