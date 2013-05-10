package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 01:00
 * To change this template use File | Settings | File Templates.
 */
public class Attribute {

    String name;

    public Attribute(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public Restriction eq(String i){  // podria hacer que simplemente sea un Object lo que le pase... pero mejor evitar que pase objetos complicados...
        return Restriction.eq(name,i); //paso el string name o el att completo?  (this )
    }
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
    }

    public Order desc(){
        return Order.desc(this);
    }
    public Order asc(){
        return Order.asc(this);
    }

}
