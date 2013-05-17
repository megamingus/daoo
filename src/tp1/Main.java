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
        Attribute age=new Attribute("Age");
        Query q=new QueryBuilder()
                .from("people")
                .get(name,age)
                .with(name.eq("Cata").and(age.ge(45)).or(age.between(2,7).and(new Attribute("accepted").not())))
                .orderBy(name.desc())
                .limit(1)
                .build();
        SQLVisitor visitor=new SQLVisitor();
        q.accept(visitor);
        System.out.println(visitor.result);
    }
}
