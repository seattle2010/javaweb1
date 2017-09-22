package ajax._05linkQuery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 城市对象
 */
public class City {
	private Long id;
	private String name;

	public City() {
	}

	public City(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * 根据省份id查询省份中的城市
	 * @return
	 */
	public static List<City> getCityByProvinceId(Long pid) {
		
		List<City> citys = new ArrayList<City>();
		
		if (pid == 1) {
			citys = Arrays.asList(
					new City(11L,"哈尔滨"),
					new City(12L,"鸡西"),
					new City(13L,"鹤岗"),
					new City(14L,"双鸭山"),
					new City(15L,"大庆"),
					new City(16L,"伊春"),
					new City(17L,"黑河"),
					new City(18L,"绥化")
			);
		} else if (pid == 2) {
			citys = Arrays.asList(
					new City(21L,"长春"),
					new City(22L,"吉林"),
					new City(23L,"四平"),
					new City(24L,"通化"),
					new City(25L,"白山"),
					new City(26L,"辽源"),
					new City(27L,"白城"),
					new City(28L,"松原")
			);
		} else if (pid == 3) {
			citys = Arrays.asList(
					new City(31L,"大连"),
					new City(32L,"沈阳"),
					new City(33L,"鞍山"),
					new City(34L,"抚顺"),
					new City(35L,"本溪"),
					new City(36L,"丹东"),
					new City(37L,"锦州"),
					new City(38L,"铁岭")
			);
		}
		return citys;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "City [id=" + id + ", name=" + name + "]";
	}
}
