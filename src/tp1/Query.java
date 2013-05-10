package tp1;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 01:00
 * To change this template use File | Settings | File Templates.
 */
public class Query implements Visitable {

    final Table table;
    final List<Attribute> attributes;
    final List<Restriction> restrictions;
    final List<Order> orders;
    final Limit limit;

    public Query(Table table,List<Attribute> attributes,List<Restriction> restrictions,List<Order> orders,Limit limit){
        this.table=table;
        this.attributes=attributes;
        this.restrictions=restrictions;
        this.orders=orders;
        this.limit=limit;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for(Attribute a:attributes){
            a.accept(visitor);
        }
        table.accept(visitor);
        for(Restriction r:restrictions){
            r.accept(visitor);
        }
        for(Order o:orders){
            o.accept(visitor);
        }
        limit.accept(visitor);

    }
}
