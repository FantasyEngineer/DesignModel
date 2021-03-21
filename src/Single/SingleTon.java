package Single;


/**
 * 懒汉式，需要的时候才会去实例化
 */
public class SingleTon {
    private static SingleTon singleTon = null;


    private SingleTon() {

    }


    public static SingleTon getSingleTon() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
