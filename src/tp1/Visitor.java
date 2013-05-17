package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 01:11
 * To change this template use File | Settings | File Templates.
 */
public interface Visitor {
    void visit(Query query);
    void visit(Table table);
    void visit(Where where);
    void visit(UnaryExpression unaryExpression);
    void visit(BinaryExpression binaryExpression);
    void visit(Attribute attribute);
    void visit(Restriction restriction);
    void visit(OrderBy order);
    void visit(Order order);
    void visit(Limit limit);
    void visit(Symbol<?> tSymbol);

}
