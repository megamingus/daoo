package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 17/05/13
 * Time: 03:56
 * To change this template use File | Settings | File Templates.
 */
public class Symbol<T> extends Expression {

    final T symbol;

    public Symbol (T symbol){
        this.symbol=symbol;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
