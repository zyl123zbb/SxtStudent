import java.util.Arrays;
/*Arrays.sort(Object[])可以对任意数组进行排序，
但待排序的元素必须实现Comparable<T>这个泛型接口*/
class TestPerson {
    public static void main(String[] args){
        Person[] ps=new Person[]{
        new Person("Bob",61),
        new Person("Alice",88),
                new Person("Lily",75),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}
public class Person implements Comparable<Person>{
    String name;
    int score;//基础类型int并不能使用compareTo函数

    Person(String name,int score){
        this.name=name;
        this.score=score;
    }
    @Override
    public int compareTo(Person other){
        /**
         * 比较者大于被比较者（compareTo方法里面的对象），返回正整数
         * 比较者等于被比较者，返回0
         * 比较者小于被比较者，返回负整数
         */
          return other.score-this.score;
        //return this.score>other.score?-1:1;
       // return new Integer(other.score).compareTo(this.score);
    }
@Override
    public String toString(){
        return this.name+"，"+this.score;
    }
}
