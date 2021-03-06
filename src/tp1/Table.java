package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 10/05/13
 * Time: 01:28
 * To change this template use File | Settings | File Templates.
 */
public class Table implements Visitable {
    final Symbol<String> name;
    public Table(String table){
        name=new Symbol<String>(table);
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        name.accept(visitor);
    }
}
