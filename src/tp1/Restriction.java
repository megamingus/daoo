package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 01:00
 * To change this template use File | Settings | File Templates.
 */
public class Restriction implements Visitable{
    final OperationEnum operation;
    final String attribute;     // podria ser un Attribute pero lo dejamos un string para simplificar
    final String value;

    private Restriction(String attr, OperationEnum op, Object o){
        attribute=attr;
        value=o.toString();
        operation =op;
    }

    static Restriction eq(String attr,Object o){
        return new Restriction(attr, OperationEnum.EQ,o);
    }

    static Restriction ne(String attr,Object o){
        return new Restriction(attr, OperationEnum.NE,o);
    }
    static Restriction lt(String attr,Object o){
        return new Restriction(attr, OperationEnum.LT,o);
    }
    static Restriction gt(String attr,Object o){
        return new Restriction(attr, OperationEnum.GT,o);
    }
    static Restriction ge(String attr,Object o){
        return new Restriction(attr, OperationEnum.GE,o);
    }
    static Restriction le(String attr,Object o){
        return new Restriction(attr, OperationEnum.LE,o);
    }
    static Restriction between(String attr,Object o){
        return new Restriction(attr, OperationEnum.BETWEEN,o);
    }
    static Restriction like(String attr,Object o){
        return new Restriction(attr, OperationEnum.LIKE,o);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
