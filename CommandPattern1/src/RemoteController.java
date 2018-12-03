
public class RemoteController {

		CommandInterface commandInt;
		
		CommandInterface[] commandSlotsON;
		CommandInterface[] commandSlotsOFF;
		CommandInterface nc = new NoCommand();
		CommandInterface undoCommand;
		
		int slot;
		
		public RemoteController() {
			commandSlotsON = new CommandInterface[7];
			commandSlotsOFF = new CommandInterface[7];
			
			for(int k = 0; k< (commandSlotsON.length); k++) {
				
				commandSlotsON[k]= nc;
				commandSlotsOFF[k] = nc;
			}
			
			undoCommand = nc;
		}
		
		public void setCommand(int slot, CommandInterface on, CommandInterface off ) {
			
			commandSlotsON[slot] = on;
			commandSlotsOFF[slot] = off;
			
		}
		
		public void buttonOnWasPressed(int slot) {
			
			commandSlotsON[slot].execute();
			undoCommand = commandSlotsON[slot];
			
		}
		
		public void buttonOffWasPressed(int slot) {
			commandSlotsOFF[slot].execute();
			undoCommand = commandSlotsOFF[slot];		
		}
		
		public void buttonUndoWasPressed() {
			undoCommand.undo();
		}
		@Override
		public String toString() {
			
			StringBuffer sBuff = new StringBuffer();
			sBuff.append("\n ******** Remote Controller *********** \n");
			for(int k = 0; k < commandSlotsON.length; k++) {
				sBuff.append("[slot "+k+" ] "+ commandSlotsON[k].getClass().getName() + "\t\t" + commandSlotsOFF[k].getClass().getName() +"\n");
			}
			
			return sBuff.toString();
		}
		
		
}
