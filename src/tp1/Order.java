package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 01:01
 * To change this template use File | Settings | File Templates.
 */
public class Order implements Visitable{
    final Attribute attribute;
    final OrderEnum order;
    private Order(Attribute attribute,OrderEnum o){
        this.attribute=attribute;
        order=o;
    }

    static Order desc(Attribute attribute){
        return new Order(attribute,OrderEnum.DESC);
    }

    static Order asc(Attribute attribute){
        return new Order(attribute,OrderEnum.ASC);
    }

    @Override
    public void accept(Visitor visitor) {
        attribute.accept(visitor);
        visitor.visit(this);
    }
}
