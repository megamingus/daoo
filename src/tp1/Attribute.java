package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 01:00
 * To change this template use File | Settings | File Templates.
 */
public class Attribute<T> implements Visitable{

    final Symbol<String> name;

    public Attribute(String name){
        this.name=new Symbol<String>(name);
    }

    public BinaryExpression eq(T i){
        return BinaryExpression.eq(name,new Symbol<T>(i));
    }
    public BinaryExpression ne(T i){
        return BinaryExpression.ne(name,new Symbol<T>(i));
    }
    public BinaryExpression gt(T i){
        return BinaryExpression.gt(name,new Symbol<T>(i));
    }
    public BinaryExpression lt(T i){
        return BinaryExpression.lt(name,new Symbol<T>(i));
    }
    public BinaryExpression le(T i){
        return BinaryExpression.le(name,new Symbol<T>(i));
    }
    public BinaryExpression ge(T i){
        return BinaryExpression.ge(name,new Symbol<T>(i));
    }
    public BinaryExpression between(T min,T max){
        return BinaryExpression.gt(name,new Symbol<T>(min)).and(this.lt(max));
    }
    public BinaryExpression like(T i){
        return BinaryExpression.like(name,new Symbol<T>(i));
    }
    public UnaryExpression not(){
        return UnaryExpression.not(name);
    }

    /*
    public Restriction ne(String i){
        return Restriction.ne(name,i);
    }
    public Restriction lt(String i){
        return Restriction.lt(name,i);
    }
    public Restriction gt(String i){
        return Restriction.gt(name,i);
    }
    public Restriction ge(String i){
        return Restriction.ge(name,i);
    }
    public Restriction le(String i){
        return Restriction.le(name,i);
    }
    public Restriction between(String i){
        return Restriction.between(name,i);
    }
    public Restriction like(String i){
        return Restriction.like(name,i);
    }

    public Restriction eq(int i){
        return Restriction.eq(name,i);
    }
    public Restriction ne(int i){
        return Restriction.ne(name,i);
    }
    public Restriction lt(int i){
        return Restriction.lt(name,i);
    }
    public Restriction gt(int i){
        return Restriction.gt(name,i);
    }
    public Restriction ge(int i){
        return Restriction.ge(name,i);
    }
    public Restriction le(int i){
        return Restriction.le(name,i);
    }
    public Restriction between(int i){
        return Restriction.between(name,i);
    }
    public Restriction like(int i){
        return Restriction.like(name,i);
    }                       */

    public Order desc(){
        return Order.desc(this);
    }
    public Order asc(){
        return Order.asc(this);
    }

    @Override
    public void accept(Visitor visitor) {
        name.accept(visitor);
        visitor.visit(this);
    }
}
