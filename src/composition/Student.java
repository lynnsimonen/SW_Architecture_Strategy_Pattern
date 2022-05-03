package composition;

public class Student {

    private String name;
    private int age;
    private Address address;  //(String streetAddress, int zipCode, String state, String phone);

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.address = new AddressInfo();
        this.name = name;
        this.age = age;
    }

    public Student() {

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

    //-----------------------------------

    public void setAddressAbility (Address newAddressType) {
        address = newAddressType;
    }

    public String getState() {
        return address.address().toString();
    }

}
