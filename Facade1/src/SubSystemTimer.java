
public class SubSystemTimer {

		private int program;
		private boolean isOn;
		
		public SubSystemTimer() {
			// TODO Auto-generated constructor stub
		}
		
		public void program(int program) {
			this.program = program;
		}
		
		public void on() {
			this.isOn = true;
			System.out.println("Turning the timer ON");
		}
		public void off() {
			this.isOn = false;
			System.out.println("Turning the timer OFF");
		}

		protected int getProgram() {
			return program;
		}

		
		
		
}
