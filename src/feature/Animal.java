package feature;

/**
 * @author: liuxs
 * @description: 动物抽象类
 * @date: Created in 8:14 PM  2019/1/12
 */
public abstract class Animal {

    private String name;

    public void sayMyself(){
        System.out.println("我只是个动物");
    }

    public abstract void advag();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
