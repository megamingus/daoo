package tp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 01:29
 * To change this template use File | Settings | File Templates.
 */
public class QueryBuilder {

    private Table table;
    private List<Attribute> attributes;
    private List<Expression<?>> restrictions;
    private List<Order> orders;
    private Limit limit;

    public QueryBuilder from(String table){
        this.table=new Table(table);
        attributes=new ArrayList<Attribute>();
        restrictions=new ArrayList<Expression<?>>();
        orders=new ArrayList<Order>();
        return this;
    }

    public QueryBuilder get(Attribute... attributes){
        this.attributes=Arrays.asList(attributes);
        return this;
    }
    
    public QueryBuilder get(String... attributes){
        for(String attr:attributes){
            this.attributes.add(new Attribute(attr));
        }
        return this;
    }

    public QueryBuilder with(Expression<?>... restrictions){
        this.restrictions=Arrays.asList(restrictions);
        return this;
    }

    public QueryBuilder orderBy(Order... orders){
        this.orders=Arrays.asList(orders);
        return this;
    }

    public QueryBuilder limit(int numberOfRows){
    	if(numberOfRows < 0)
    		throw new NumberFormatException();
    	this.limit = new Limit(numberOfRows);
        return this;
    }

    public QueryBuilder limit(int offset, int numberOfRows){
    	if(offset < 0 || numberOfRows < 0)
    		throw new NumberFormatException();
    	this.limit = new Limit(offset, numberOfRows);
    	return this;
    }
    
    public Query build(){
        return new Query(table, attributes,restrictions,orders,limit);
    }
}