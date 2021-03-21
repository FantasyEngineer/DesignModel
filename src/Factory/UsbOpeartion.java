package Factory;

public class UsbOpeartion implements FileOperationImp {
    @Override
    public void readFile(String name) {
        System.out.println("UsbOpeartion-read");

    }

    @Override
    public void writeFile(String path) {
        System.out.println("UsbOpeartion-writeFile");

    }
}
