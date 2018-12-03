
public class StereoCommand implements CommandInterface {

	Stereo st;
	
	public StereoCommand(Stereo s) {
		this.st = s;
	}
	@Override
	public void execute() {
		
		st.on();
		st.setCD();
		st.setVolume();
		

	}

	@Override
	public void undo() {
		st.ejectCD();
		st.off();
		st.setVolumeZero();
		

	}

}
