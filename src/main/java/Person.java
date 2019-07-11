public class Person {
    private String name;
    private Mobile mobile;

    public void call () {
        mobile.limitMsg();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
}
