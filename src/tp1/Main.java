package tp1;

/**
 * Created with IntelliJ IDEA.
 * User: Mingus
 * Date: 05/05/13
 * Time: 17:26
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        Attribute name=new Attribute("name");
        Query q=new QueryBuilder()
                .from("people")
                .get("att","att2")
                .with(name.eq("Cata"),new Attribute("age").gt(14))
                .orderBy(name.desc())
                .limit(1)
                .build();
        SQLVisitor visitor=new SQLVisitor();
        q.accept(visitor);
        System.out.println(visitor.result);
    }
}
