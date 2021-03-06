
public abstract class Master extends Person{

	
	protected String name;
	protected String description;

	public abstract void giveAdvice() throws Exception;

	public abstract void performRepair() throws Exception;
	public abstract void performMaintance() throws Exception;
	
	protected String description() {

		String desc = getClass().getSimpleName();
		return desc;
	}
}
