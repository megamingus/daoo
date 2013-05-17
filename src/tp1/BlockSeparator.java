package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 17/05/13
 * Time: 13:09
 * To change this template use File | Settings | File Templates.
 */
public class BlockSeparator extends Expression {

    final Separator separator;

    private BlockSeparator(Separator separator) {
        this.separator = separator;
    }

    static BlockSeparator begin(){
        return new BlockSeparator(Separator.BEGIN);
    }

    static BlockSeparator end(){
        return new BlockSeparator(Separator.END);
    }

    public enum Separator {
        BEGIN,END
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
