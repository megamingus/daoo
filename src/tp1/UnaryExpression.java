package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 17/05/13
 * Time: 04:06
 * To change this template use File | Settings | File Templates.
 */
public class UnaryExpression extends Expression {
    // solo el !
    final OperationEnum op;
    final Expression<?> expression;

    private UnaryExpression(OperationEnum op, Expression<?> expression) {
        this.op = op;
        this.expression = expression;
    }

    public static UnaryExpression not(Expression<?> expression) {
        return new UnaryExpression(OperationEnum.NOT,expression);
    }

 /*   public BinaryExpression and(Expression<?> right){
        return BinaryExpression.and(this,OperationEnum.AND,right);
    }
    public BinaryExpression or(Expression<?> right){
        return BinaryExpression.or(this,right);
    }*/
    static BinaryExpression eq(Expression<?> left,Expression<?> right){
        return BinaryExpression.eq(left,right);
    }
    static BinaryExpression ne(Expression<?> left,Expression<?> right){
        return BinaryExpression.ne(left,right);
    }

    static BinaryExpression gt(Expression<?> left,Expression<?> right){
        return BinaryExpression.gt(left,right);
    }
    static BinaryExpression lt(Expression<?> left,Expression<?> right){
        return BinaryExpression.lt(left,right);
    }
    static BinaryExpression ge(Expression<?> left,Expression<?> right){
        return BinaryExpression.ge(left,right);
    }
    static BinaryExpression le(Expression<?> left,Expression<?> right){
        return BinaryExpression.le(left,right);
    }
    static BinaryExpression between(Expression<?> left,Expression<?> right){
        return BinaryExpression.between(left,right);
    }
    static BinaryExpression like(Expression<?> left,Expression<?> right){
        return BinaryExpression.like(left,right);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        expression.accept(visitor);
    }
}