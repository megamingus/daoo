package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 08:52
 * To change this template use File | Settings | File Templates.
 */
public class Limit implements Visitable{
    final int limit;
    Limit(int limit){
        this.limit=limit;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
