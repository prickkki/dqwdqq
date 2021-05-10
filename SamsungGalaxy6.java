package hahaa;

public class SamsungGalaxy6 extends Phone {
	private String color ;
	private String material;
	private int imei;
	private String modelName;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getImei() {
		return imei;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public SamsungGalaxy6(int batteryLife, String color , String modelName, String material, int imei) {
		super(batteryLife);
		this.color =color;
		this.imei = imei;
		this.modelName = modelName;
		this.material = material ;
	}
	public SamsungGalaxy6(int batteryLife) {
		super(batteryLife);
	}
	
}
