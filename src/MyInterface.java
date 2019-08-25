import java.util.Objects;

public interface MyInterface {
    void abc();
}

class MyClass implements MyInterface {

    private String name;
    private String phone;

    public MyClass(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return name.equals(myClass.name) &&
                phone.equals(myClass.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void abc() {

    }

}
