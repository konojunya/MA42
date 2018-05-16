package ex3interface;

public class ImplementEx2 implements InterfaceExample {
    @Override
    public String getName() {
        return "私はImplementEx2です。";
    }

    @Override
    public int fooTimes() {
        return NUM * 25;
    }

    @Override
    public String getComment() {
        return "私はImplementEx2のコメントだよん。";
    }

    @Override
    public void fooMethod() {}
}
