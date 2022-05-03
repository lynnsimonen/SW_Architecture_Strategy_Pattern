package composition;

public class Student implements Address {

    private String name;
    private int age;
    public String phone;
    public String state;
    public String streetAddress;
    public int zipCode;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.state = state;
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
    }

    public String getPhone(){
        return phone;
    }

    public String getState(){
        return state;
    }

    public String getStreetAddress(){
        return streetAddress;
    }

    public int getZipCode(){
        return zipCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}