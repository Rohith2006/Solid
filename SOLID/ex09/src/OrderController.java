public class OrderController {

    private OrderRepository repo;

    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    void create(String id, double amount){
        repo.save(new Order(id, amount));
        System.out.println("Created order: " + id);
    }
}