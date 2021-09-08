import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();//创建List
       // List<Integer> list1=List.of(1,2,3);  list
        list.add("apple");
        list.add(null);
        list.add("apple");
        String second=list.get(1);//null
        System.out.println(second);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){//遍历List,不推荐
            String s=list.get(i);//get(int)方法只有ArrayList的实现是高效的
            System.out.println(s);
        }
        /*使用Iterator来访问List,Iterator本身也是一个对象，有俩个方法：
        *boolean hasNext()判断是否有下一个元素；
        * E next()返回下一个元素
        */
       /* for(Iterator<String> it = list.iterator(); it.hasNext();){
            String s=it.next();
            System.out.println(s);
        }*/
        for(String s:list){//foreach循环本身就可以使用Iterator遍历
            System.out.println(s);
        }
//把List变成Array，调用toArray()方法直接返回一个Object[]数组,实际会丢失类型信息；
      Object[] array=list.toArray();
        for(Object s:array){
            System.out.println(s);
        }
//把list变成Array,给toArray(T[])传入一个类型相同的Array,List内部自动把元素复制到传入的Array中
       // String[] array1=list.toArray(new String[3]);//3代表数组大小
        String[] array1=list.toArray(new String[list.size()]);//list.size()代表当前数组大小
        //String[] array1=list.toArray(String[]::new);//3代表数组大小

        for(String n:array1){
            System.out.println(n);
        }
    }
}
/*只要实现了Inerable接口的集合类都可以直接用foreach循环来遍历*/

