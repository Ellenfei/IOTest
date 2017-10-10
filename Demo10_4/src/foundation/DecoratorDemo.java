package foundation;
/*
 * װ����ģʽ�� ��̬��һ���������һЩ�����ְ��
 * 
 */
/*//���屻װ����
interface Human {
	public abstract void wearClothes();
	public abstract void walkToWhere();
}*/
//����װ����
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
//��������װ��,����ϸ������
class Decorator0 extends Decorator {

	public Decorator0(Human human) {
		super(human);
		// TODO Auto-generated constructor stub
	}
	
	public void goHome() {
		System.out.println("0�����ӡ�");
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
//���屻װ���ߣ���ʼ״̬���Լ���װ��
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

