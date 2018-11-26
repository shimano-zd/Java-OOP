
public class SubSystemEnergy {

		private String mode;
		
		public SubSystemEnergy() {
			// TODO Auto-generated constructor stub
		}
		
		public void on() {
			System.out.println("Energy Mode ON");
		}
		
		public void off() {
			System.out.println("Energy Mode OFF");
		}

		protected String getMode() {
			return mode;
		}

		protected void setMode(String mode) {
			this.mode = mode;
		}
		
		
}
