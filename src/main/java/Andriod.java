public class Andriod extends Mobile {

    @Override
    public void makeACall(String msg) {
        System.out.println("<Andriod>Message : "+msg);
    }

    @Override
    public void limitMsg() {
        System.out.println("<andriod>message cannot be sent");
    }
}
