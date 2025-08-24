public class SqlOrderRepository implements  OrderRepoI{

    @Override
    public void save(String id) {
        // Simulate saving to a SQL database
        System.out.println("Saving order " + id + " to SQL database.");
    }
}
