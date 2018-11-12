
public class WINGUIfactory implements GUIFactory {

	@Override
	public Button createButton() {
		WinButton winbtn = new WinButton();
		return winbtn;
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		WinCheckBox winbox = new WinCheckBox();
		return winbox;
	}

}
