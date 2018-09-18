package Builder;

/**
 * ***********************************************************
 *
 * @类名 : Builder
 * @DESCRIPTION :建造者模式
 * @AUTHOR :  admin
 * @DATE :  2018.9.18
 *
 * ***********************************************************
 */
public class Builder {

  /**
   * 先假设有一个问题，我们需要创建一个学生对象，属性有name,number,class,sex,age,
   * school等属性，如果每一个属性都可以为空，也就是说我们可以只用一个name,也可以用一个school,
   * name,或者一个class,number，或者其他任意的赋值来创建一个学生对象，这时该怎么构造？
   */
  static class Student{
    String name = null ;
    int number = -1 ;
    String sex = null ;
    int age = -1 ;
    String school = null ;

    static class StudentBuilder {

      String name = null;
      int number = -1;
      String sex = null;
      int age = -1;
      String school = null;

      public StudentBuilder setName(String name) {
        this.name = name;
        return this;
      }

      public StudentBuilder setNumber(int number) {
        this.number = number;
        return this;
      }

      public StudentBuilder setSex(String sex) {
        this.sex = sex;
        return this;
      }

      public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
      }

      public StudentBuilder setSchool(String school) {
        this.school = school;
        return this;
      }

      public Student build(){
        return new Student(this);
      }
    }
    public Student(StudentBuilder builder){
      this.age = builder.age;
      this.name = builder.name;
      this.number = builder.number;
      this.school = builder.school ;
      this.sex = builder.sex ;
    }

    public static void main(String[] args) {
      Student a=new Student.StudentBuilder().setAge(11).setNumber(10).build();
      Student b=new Student.StudentBuilder().setSchool("野鸡大学").build();
    }
  }
}
