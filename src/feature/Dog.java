package feature;

/**
 * @author: liuxs
 * @description:
 * @date: Created in 8:18 PM  2019/1/12
 */
public class Dog extends Animal {

    private String  Sex;

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    @Override
    public void advag() {
        System.out.println("我跑的快");
    }

    public void myself(){
        super.sayMyself();
    }
}
