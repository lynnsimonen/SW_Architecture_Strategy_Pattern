package composition;

public interface Address {
    Address address();
}

class AddressInfo implements Address{
    String streetAddress;
    int zipCode;
    String state;
    String phone;

    public Address address() {

        return new AddressInfo();

        //return streetAddress + ", " + zipCode + ", " + state + " phone: " + phone;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public static String getHello() {
        return "hello";
    }

    @Override
    public String toString() {
        return state;
    }
}
