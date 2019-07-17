
public class RectangleAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect1 = new Rectangle(); // no argument
		rect1.draw();
		Rectangle rect2 = new Rectangle(15, 5, 10, 10);
		rect2.draw();
		Rectangle rect3 = new Rectangle(20, 8);
		rect3.draw();
	
		//get the width of rect1
		//rect1.width // will not compile because width is declared private
		
		//Rectangle rect4 = new Rectangle(1,1,0,0);
		
		//move rectangle rect2
		rect2.moveTo(20, 10);
		rect2.draw();
		
		System.out.println(rect2.area());
	}

}
