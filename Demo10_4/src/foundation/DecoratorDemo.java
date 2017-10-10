package foundation;
/*
 * 装饰者模式： 动态给一个对象添加一些额外的职责。
 * 
 */
/*//定义被装饰者
interface Human {
	public abstract void wearClothes();
	public abstract void walkToWhere();
}*/
//定义装饰者
abstract class Decorator implements Human {
	private Human human;
	public Decorator(Human human) {
		this.human = human;
	}
	
	public void wearClothes () {
		human.wearClothes();
	}
	
	public void walkToWhere () {
		human.walkToWhere();
	}
}
//定义三种装饰,依次细化功能
class Decorator0 extends Decorator {

	public Decorator0(Human human) {
		super(human);
		// TODO Auto-generated constructor stub
	}
	
	public void goHome() {
		System.out.println("0近房子。");
	}
	public void findMap() {
		System.out.println("0 find map...");
	}
	public void walkToWhere() {
		super.walkToWhere();
		findMap();
	}
	public void wearClothes() {
		super.wearClothes();
		goHome();
	}
	
}
class Decorator1 extends Decorator {

	public Decorator1(Human human) {
		super(human);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void wearClothes() {
		// TODO Auto-generated method stub
		super.wearClothes();
		goClothespress();
	}
	@Override
	public void walkToWhere() {
		// TODO Auto-generated method stub
		super.walkToWhere();
		findPlaceOnMap();
	}
	public void goClothespress() {
		System.out.println("go to spress to find....");
	}
	public void findPlaceOnMap() {
		System.out.println("go to map to find fun place....");
	}	
}
class Decorator2 extends Decorator {

	public Decorator2(Human human) {
		super(human);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void wearClothes() {
		// TODO Auto-generated method stub
		super.wearClothes();
		findClothes();
	}

	@Override
	public void walkToWhere() {
		// TODO Auto-generated method stub
		super.walkToWhere();
		findPlace();
	}
	
	public void findClothes() {
		System.out.println("find clothes ....");
	}
	public void findPlace() {
		System.out.println("find some fun place...");
	}
	
}
//定义被装饰者，初始状态有自己的装饰
class Person implements Human {

	@Override
	public void wearClothes() {
		// TODO Auto-generated method stub
		System.out.println("what to wear...");
	}

	@Override
	public void walkToWhere() {
		// TODO Auto-generated method stub
		System.out.println("where to go...");
	}

	
}

public class DecoratorDemo {
	public static void main(String[] args){
		Human per = new Person();
		Decorator dec0 = new Decorator2(per);
		Decorator dec1 = new Decorator2(new Decorator1(new Decorator0(per)));
		
		dec0.wearClothes();
		dec0.walkToWhere();
		System.out.println();
		dec1.wearClothes();
		dec1.walkToWhere();
	}

}

