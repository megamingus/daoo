package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 09:16
 * To change this template use File | Settings | File Templates.
 */
public abstract class Expression<T> implements Visitable{
    
	public abstract void accept(Visitor visitor);
}