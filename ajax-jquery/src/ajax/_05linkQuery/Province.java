package ajax._05linkQuery;

import java.util.ArrayList;
import java.util.List;

/**
 * 省份对象
 */
public class Province {

	private Long id;
	private String name;

	public Province() {
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Province(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public static List<Province> getAllProvince() {
		List<Province> provinces = new ArrayList<Province>();
		provinces.add(new Province(1L, "黑龙江"));
		provinces.add(new Province(2L, "吉林"));
		provinces.add(new Province(3L, "辽宁"));
		return provinces;
	}
	public String toString() {
		return "Province [id=" + id + ", name=" + name + "]";
	}

}
