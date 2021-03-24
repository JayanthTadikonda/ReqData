public class CheckPersistence {

    public static void main(String[] args) {

        Persistence p1 = new FilePersistence();
        Persistence p2 = new DatabasePersistence();
        p1.persist();
        p2.persist();
    }
}
