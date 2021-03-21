package Single;

/**
 * 静态内部类的形式
 */
public class SingleTon3 {

    private SingleTon3() {

    }

    private static class SingleTon3Holder {
        private static final SingleTon3 singleTon3 = new SingleTon3();
    }

    public static SingleTon3 getInstance() {
        return SingleTon3Holder.singleTon3;
    }
}
