package _02EL;

import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ToString
@Getter
public class Person {
    private String username = "tom";
    private Integer age = 16;
    private String[] hobbys = {"java", "c", "girl"};
    private List<String> hobbyList = Arrays.asList("list1", "list2", "list3");
    private Map<String, Object> map = new HashMap<String, Object>() {
    {
        this.put("company", "huawei");
        this.put("name", "jack");
        this.put("www.baidu.com", "域名");

    }
};
}
