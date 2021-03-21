package Factory;

public class Client implements FileOperationImp {

    private FileOperationImp fileOperationImp;

    public Client(int name) {
        if (name == 1) {
            fileOperationImp = new StorageOperation();
        } else {
            fileOperationImp = new UsbOpeartion();

        }
    }


    @Override
    public void readFile(String name) {
        fileOperationImp.readFile(name);
    }

    @Override
    public void writeFile(String path) {
        fileOperationImp.writeFile(path);
    }


    public static void main(String[] args) {
        Client client = new Client(0);
        client.readFile("1234131");
        client.writeFile("12313");
    }
}
