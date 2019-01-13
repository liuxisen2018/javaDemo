package statictest;

/**
 * @author: liuxs
 * @description:
 * @date: Created in 5:23 PM  2019/1/13
 */
public class Person {

    Book book1 = new Book("book1初始化");
    static Book book2 = new Book("static book2 初始化");
    Book book3 = new Book("book3初始化");
    static Book book4 = new Book("static book4 初始化");

    Person(String msg){
        System.out.println(msg);
    }

    public static void funStatic(){
        System.out.println("初始化静态成员");
    }
}
