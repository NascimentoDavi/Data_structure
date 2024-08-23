package entity;

public class Item {
	private int code;
	
	public Item(int code) {
		super();
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
    
	@Override
	public String toString() {
		return "code=" + code;
	}
}
