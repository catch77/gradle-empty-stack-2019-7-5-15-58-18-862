public class IPhoneRobot extends Person {



    @Override
    public void call() {
        if (getMobile().getClass().equals(iPhone.class)){
            getMobile().limitMsg();
        } else {
            System.out.println("I am iPhoneRobot, so I can not use others' mobile except for iPhone");
        }

    }
}
