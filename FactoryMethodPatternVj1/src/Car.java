
public abstract class Car {

		protected String type;
		
		public Car() {
			// TODO Auto-generated constructor stub
		}
		
		public void manufacture() {
			
			System.out.println("=========== New car order ================");
			System.out.println("Basic manufacturing process...");
			
		};
		public void paint(String s) {
			
			System.out.println("Painting car in : " + s);
			
		};
		public void deliver() {
			
			System.out.println("Deliver car to the car store...");
		};
		
}
