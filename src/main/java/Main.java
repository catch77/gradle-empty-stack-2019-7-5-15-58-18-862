public class Main {

    public static void main(String[] args) {
	// write your code here
//        Mobile mobile = new Mobile("mobile","black","mobileBrand");
        String msg = "pppp";
//        mobile.makeACall(msg);
//        mobile.printProperty();

        iPhone iPhone = new iPhone();
        iPhone.makeACall(msg);

        Andriod andriod = new Andriod();
        andriod.makeACall(msg);

        Person person = new Person();
        person.setMobile(iPhone);
        person.call();
        person.setMobile(andriod);
        person.call();

        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        iPhoneRobot.setMobile(iPhone);
        iPhoneRobot.call();
        iPhoneRobot.setMobile(andriod);
        iPhoneRobot.call();
    }
}
