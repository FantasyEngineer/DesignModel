package Single;

public enum SingleTon4 {

    getInstance;

    public Manager getInstance() {
        return manager;
    }

    private Manager manager = null;

    private SingleTon4() {
        manager = new Manager();
    }

}
