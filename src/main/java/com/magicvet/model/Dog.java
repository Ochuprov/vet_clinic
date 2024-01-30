package main.java.com.magicvet.model;

public class Dog extends Pet{

    private String size;

    @Override
    public String toString() {
        return "Pet {"
                + "type = " + getType()
                + ", sex = " + getSex()
                + ", age = " + getAge()
                + ", name = " + getName()
                + ", size = " + getSize()
                + "}";
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
}
