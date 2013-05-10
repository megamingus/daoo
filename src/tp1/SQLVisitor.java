package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 08:28
 * To change this template use File | Settings | File Templates.
 */
public class SQLVisitor implements Visitor {

    String result;

    @Override
    public void visit(Query query) {
        result="select ";
    }

    @Override
    public void visit(Attribute attribute) {
        result+=attribute.name+", ";
    }

    @Override
    public void visit(Table table) {
        result=result.substring(0,result.length()-2);
        result+=" from "+table.name+" where 1=1 and ";
    }

    @Override
    public void visit(Restriction restriction) {
        String op;
        switch (restriction.operation){
            case EQ: op="="; break;
            case NE: op="<>"; break;
            case GE: op=">="; break;
            case GT: op=">"; break;
            case LE: op="<="; break;
            case LT: op="<"; break;
            case BETWEEN: op="BETWEEN"; break;
            case LIKE: op="LIKE"; break;
            default: op="IN"; break;
        }
        result+= restriction.attribute+" "+op+" "+restriction.value + " AND ";
        //esto esta mal no puede terminar con un
        // AND , lo dejo por ahora, pero falta agregar
        //funcionalidad AND / OR (arbol para consultas complejas (con parentesis y ands y ors)
    }

    @Override
    public void visit(Order order) {
        result=result.substring(0,result.length()-4);
        result+="Order By "+order.attribute.name +" "+order.order+" ";
        // deberia haber una clase order.. como con el and porque si pones mas de un orden esto explootaa
    }

    @Override
    public void visit(Limit limit) {
        result+="limit "+limit.limit;  // maaal deberia haber una clase limit para escribir el lmit y dps poner todos los limites
    }
}
