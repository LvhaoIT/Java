package ����;

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
        System.out.println("ѧУ�ǣ�"+school);
    }

    @Override
    public void studyInfo() {
        System.out.println("ѧϰ����ѧ֪ʶ");
    }

    @Override
    public void moveType() {
        System.out.println("��綯����ѧ");
    }

    public String toString(){
        System.out.println("���֣�"+this.name+"  �Ա�"+(this.age==true?"��":"Ů")+"  �������ڵ�ѧУΪ�� "+this.school);
        return null;
    }

    private void Prifun(String str){
        System.out.println("��˼����"+str+"����");

    }

    public void fun1(String s){
        System.out.println("����һ�����еĹ��з���");

    }

}
