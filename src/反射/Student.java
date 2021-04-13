package 反射;

public class Student extends Person implements Move,Study{

    public String school;
    public String str;
    private int num;

    public Student() {
    }

    public Student(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }


    private Student(String name, Boolean age, String school) {
        super(name, age);
        this.school = school;
    }

    public void ShowInfo(){
        System.out.println("学校是："+school);
    }

    @Override
    public void studyInfo() {
        System.out.println("学习的中学知识");
    }

    @Override
    public void moveType() {
        System.out.println("骑电动车上学");
    }

    public String toString(){
        System.out.println("名字："+this.name+"  性别："+(this.age==true?"男":"女")+"  现在所在的学校为： "+this.school);
        return null;
    }

    private void Prifun(String str){
        System.out.println("华思烨是"+str+"宝宝");

    }

    public void fun1(String s){
        System.out.println("这是一个类中的公有方法");

    }

}
