public class OrderController {
    OrderRepoI repo;
    public OrderController(OrderRepoI repo){
        this.repo = repo;
    }
    void create(String id){
        // hard dependency
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}