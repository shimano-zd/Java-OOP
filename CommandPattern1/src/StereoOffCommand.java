
public class StereoOffCommand implements CommandInterface {

	Stereo st;
	
	public StereoOffCommand(Stereo s) {
		this.st = s;
	}
	@Override
	public void execute() {
		
		st.off();
		st.ejectCD();
		st.setVolumeZero();
	}

	@Override
	public void undo() {
		
		st.on();
		st.setCD();
		st.setVolume();
	}

}
