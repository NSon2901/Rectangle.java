package person;

public class Person {
    protected String name;
    protected String address;
    public Person(String name, String address){
        this.name = "john";
        this.address = "Pari";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString(){
        return "Person[name=" + this.name + ",address=" + this.address + "]";
    }
}
