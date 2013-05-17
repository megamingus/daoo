package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 08:52
 * To change this template use File | Settings | File Templates.
 */
public class Limit implements Visitable{
    
	final int offset;
    final int numberOfRows;

    Limit(int offset, int numberOfRows){
        this.offset=offset;
        this.numberOfRows=numberOfRows;
    }

    Limit(int numberOfRows){
        this.offset=0;
        this.numberOfRows=numberOfRows;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}