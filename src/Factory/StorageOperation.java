package Factory;

public class StorageOperation implements FileOperationImp {
    @Override
    public void readFile(String name) {
        System.out.println("StorageOperation-read");
    }

    @Override
    public void writeFile(String path) {
        System.out.println("StorageOperation-writeFile");
    }
}
