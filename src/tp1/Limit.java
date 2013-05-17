package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 08:52
 * To change this template use File | Settings | File Templates.
 */
public class Limit implements Visitable{
    final int from;
    final int to;

    Limit(int from, int to){
        this.from=from;
        this.to=to;
    }

    Limit(int to){
        this.from=0;
        this.to=to;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

