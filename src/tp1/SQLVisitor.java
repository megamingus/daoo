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

    }

    @Override
    public void visit(Table table) {
        result+="from ";
    }

    @Override
    public void visit(Where where) {
        result+="where ";
    }

    @Override
    public void visit(UnaryExpression unaryExpression) {
        result+= "!";
    }

    @Override
    public void visit(BinaryExpression binaryExpression) {
        String op;
        switch (binaryExpression.op){
            case EQ: op="="; break;
            case NE: op="<>"; break;
            case GE: op=">="; break;
            case GT: op=">"; break;
            case LE: op="<="; break;
            case LT: op="<"; break;
            case AND: op="AND";break;
            case OR: op="OR";break;
            case BETWEEN: op="BETWEEN"; break;
            case LIKE: op="LIKE"; break;
            default: op="IN"; break;
        }
        result+=op+" ";
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
            case AND: op="AND";break;
            case OR: op="OR";break;
            case BETWEEN: op="BETWEEN"; break;
            case LIKE: op="LIKE"; break;
            default: op="IN"; break;
        }
        result+= restriction.attribute+" "+op+" "+restriction.value ;
        //esto esta mal no puede terminar con un
        // AND , lo dejo por ahora, pero falta agregar
        //funcionalidad AND / OR (arbol para consultas complejas (con parentesis y ands y ors)
    }

    @Override
    public void visit(OrderBy order) {
        result+=" Order By ";
    }

    @Override
    public void visit(Order order) {
        result+=order.order+" ";
    }

    @Override
    public void visit(Limit limit) {
        result+="limit "+limit.from+ " , "+limit.to ;
    }

    @Override
    public void visit(Symbol<?> tSymbol) {
        result+= tSymbol.symbol.toString()+ " ";
    }
}
