
public class MACGUIfactory implements GUIFactory {

	@Override
	public Button createButton() {
		MacButton macbtn= new MacButton();
		return macbtn;
	}

	@Override
	public Checkbox createCheckbox() {
		MacCheckBox macbox = new MacCheckBox();
		return macbox;
	}

}
