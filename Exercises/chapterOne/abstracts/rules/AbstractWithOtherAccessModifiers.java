package abstracts.rules;

public abstract class AbstractWithOtherAccessModifiers {

	/**
	 * Only public, protected and default access modifiers are allowed with "abstract"
	 */
	
	public abstract void publicAbstractMethod();
	
	private abstract void privateAbstractMethod();
	
	abstract void defaultAbstractMethod();
	
	protected abstract void protectedAbstractMethod();
	
	static abstract void staticAbstractMethod();
	
	final abstract void finalAbstractMethod();
}
