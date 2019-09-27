package framework;

public abstract class ItemCreator {
	
	//팩토리 메소드  -> 템플릿 메소드 
	public Item create(){

	Item item;
	requestItemInfo();
	item = createItem();
	createItemLog();
	
	return item;
	
	}
	
	//템플릿 메소드 선언 
	abstract protected void requestItemInfo();
	abstract protected void createItemLog();
	abstract protected Item createItem();
}
