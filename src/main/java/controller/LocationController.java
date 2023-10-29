package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LocationController {

	@RequestMapping("/getCityOptions")
	@ResponseBody
	public List<String> getCityOptions(@RequestParam("province") String province) {
		List<String> cityOptions = new ArrayList<>();

		if (province.equals("内蒙古")) {
			cityOptions.add("呼和浩特市");
			cityOptions.add("包头市");
			cityOptions.add("鄂尔多斯市");
		} else if (province.equals("四川")) {
			cityOptions.add("成都市");
			cityOptions.add("南充市");
			cityOptions.add("广安市");
		} else if (province.equals("广东")) {
			cityOptions.add("广州");
			cityOptions.add("深圳");
			cityOptions.add("珠海");
		}
		return cityOptions;
	}

	@RequestMapping("/getDistrictOptions")
	@ResponseBody
	public List<String> getDistrictOptions(@RequestParam("city") String city) {
		List<String> districtOptions = new ArrayList<>();

		if (city.equals("呼和浩特市")) {
			districtOptions.add("赛罕区");
			districtOptions.add("新城区");
			districtOptions.add("玉泉区");
		} else if (city.equals("包头市")) {
			districtOptions.add("昆都仑区");
			districtOptions.add("青山区");
			districtOptions.add("东河区");
		} else if (city.equals("鄂尔多斯市")) {
			districtOptions.add("东胜区");
			districtOptions.add("康巴什区");
			districtOptions.add("达拉特旗");
		}
		if (city.equals("成都市")) {
			districtOptions.add("锦江区");
			districtOptions.add("武侯区");
			districtOptions.add("青羊区");
		} else if (city.equals("南充市")) {
			districtOptions.add("顺庆区");
			districtOptions.add("高坪区");
			districtOptions.add("嘉陵区");
		} else if (city.equals("广安市")) {
			districtOptions.add("广安区");
			districtOptions.add("前锋区");
			districtOptions.add("临水县");
		}
		if (city.equals("广州")) {
			districtOptions.add("越秀区");
			districtOptions.add("番禹区");
			districtOptions.add("天河区");
		} else if (city.equals("深圳")) {
			districtOptions.add("福田区");
			districtOptions.add("罗湖区");
			districtOptions.add("南山区");
		} else if (city.equals("珠海")) {
			districtOptions.add("香洲区");
			districtOptions.add("斗门区");
			districtOptions.add("金湾区");
		}
		return districtOptions;
	}

}
