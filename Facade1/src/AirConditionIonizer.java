
public class AirConditionIonizer {

		private boolean ion;
		
		public AirConditionIonizer() {
			// TODO Auto-generated constructor stub
		}

		protected boolean isIon() {
			
			return ion;
		}

		protected void setIonON() {
			System.out.println("Ionizer is ON");
			this.ion = true;
		}
		
		protected void setIonOFF() {
			System.out.println("Ionizer is OFF");
			this.ion = false;
		}
		
}
