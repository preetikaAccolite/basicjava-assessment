//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(6);
        list1.add(9);
        list1.add(1);
        list1.add(8);
        System.out.println("before sorting:"+list1);
        Collections.sort(list1);
        System.out.println("After sorting:"+list1);

    }
}