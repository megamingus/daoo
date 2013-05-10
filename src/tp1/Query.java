package tp1;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 01:00
 * To change this template use File | Settings | File Templates.
 */
public class Query extends Main implements Visitable {

    final Table table;
    final List<Attribute> attributes;
    final List<Restriction> restrictions;
    final List<Order> orders;
    final int limit;

    public Query(Table table,List<Attribute> attributes,List<Restriction> restrictions,List<Order> orders,int limit){
        this.table=table;
        this.attributes=attributes;
        this.restrictions=restrictions;
        this.orders=orders;
        this.limit=limit;
    }

}
