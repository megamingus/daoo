package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 17/05/13
 * Time: 03:49
 * To change this template use File | Settings | File Templates.
 */
public class Where implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
