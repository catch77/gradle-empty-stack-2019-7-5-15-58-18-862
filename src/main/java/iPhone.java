public class iPhone extends Mobile {


    @Override
    public void makeACall(String msg) {
        System.out.println("<iPhone>Message : "+msg);
    }

    @Override
    public void limitMsg() {
        System.out.println("<iphone>message cannot be sent");
    }
}
