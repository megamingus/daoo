package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 17/05/13
 * Time: 04:04
 * To change this template use File | Settings | File Templates.
 */
public class BinaryExpression extends Expression{
    final Expression<?> left;
    final OperationEnum op;
    final Expression<?> right;

    private BinaryExpression(Expression<?> left, OperationEnum op, Expression<?> right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    static BinaryExpression and(Expression<?> left,Expression<?> right){
        return new BinaryExpression(left,OperationEnum.AND,right);
    }
    static BinaryExpression or(Expression<?> left,Expression<?> right){
        return new BinaryExpression(left,OperationEnum.OR,right);
    }
    static BinaryExpression eq(Expression<?> left,Expression<?> right){
        return new BinaryExpression(left,OperationEnum.EQ,right);
    }
    static BinaryExpression ne(Expression<?> left,Expression<?> right){
        return new BinaryExpression(left,OperationEnum.NE,right);
    }

    static BinaryExpression gt(Expression<?> left,Expression<?> right){
        return new BinaryExpression(left,OperationEnum.GT,right);
    }
    static BinaryExpression lt(Expression<?> left,Expression<?> right){
        return new BinaryExpression(left,OperationEnum.LT,right);
    }
    static BinaryExpression ge(Expression<?> left,Expression<?> right){
        return new BinaryExpression(left,OperationEnum.GE,right);
    }
    static BinaryExpression le(Expression<?> left,Expression<?> right){
        return new BinaryExpression(left,OperationEnum.LE,right);
    }
    static BinaryExpression between(Expression<?> left,Expression<?> right){
        return new BinaryExpression(left,OperationEnum.BETWEEN,right);
    }
    static BinaryExpression like(Expression<?> left,Expression<?> right){
        return new BinaryExpression(left,OperationEnum.LIKE,right);
    }
    static UnaryExpression not(Expression<?> expression){
        return UnaryExpression.not(expression);
    }




    @Override
    public void accept(Visitor visitor) {
        left.accept(visitor);
        visitor.visit(this);
        right.accept(visitor);
    }
}