
public class SUVCar extends Car {

		public SUVCar() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Order details: SUV was created";
		}

		@Override
		public void manufacture() {
			// TODO Auto-generated method stub
			super.manufacture();
			System.out.println("Specialized manufacturing processes for SUV EU!!!");
		}
		
		

}
