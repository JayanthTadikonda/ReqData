public class SingletonImp {

    private static SingletonImp singleton = new SingletonImp();

    private SingletonImp(){}

    public static SingletonImp getInstance(){
        return singleton;
    }

    protected static void printData(){
        System.out.println( "This method is a singleton mechanism implementation.");
    }
}