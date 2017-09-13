package _02EL;

import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

//javabean
@ToString
@Getter
public class Teacher {
    private String name= "tom";
    private Integer age = 17;
    private String[] hobbys = {"java","c","girl"};
    private List<String> list = Arrays.asList("list1", "list2", "list3");


}
