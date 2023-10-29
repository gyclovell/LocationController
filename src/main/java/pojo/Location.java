package pojo;

public class Location {
	private String province;
	private String city;
	private String district;

	@Override
	public String toString() {
		return "{\"province\":\"" + province + "\",\"city\":\"" + city + "\",\"district\":\"" + district + "\"}";
	}
}
