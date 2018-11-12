
public class Application {

	private Checkbox cBox;
	private Button btn;
	private GUIFactory GF;
	
	public Application(GUIFactory gf) {
		this.GF = gf;
	}
	
	public void createUI() {
		btn = GF.createButton();
		cBox = GF.createCheckbox();
		
	};
	
	public void paint() {
		btn.paint();
		cBox.paint();
		
	}
	
	
}
