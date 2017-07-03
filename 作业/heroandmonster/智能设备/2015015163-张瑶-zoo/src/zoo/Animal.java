package zoo;

public abstract class Animal {
	private String name;
	private String color;
    private String type;
    public Animal() {
    	super();
    }
    public Animal(String name, String color, String type) {
    	super();
    	this.name = name;
    	this.color = color;
    	this.type =type;
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getColor() {
    	return color;
    }
    public void setColor(String color) {
    	this.color = color;
    }
    public String getType() {
    	return type;
    }
    public void setType(String type) {
    	this.type = type;
    }
    public abstract void fake();
    public abstract void eat();
}
