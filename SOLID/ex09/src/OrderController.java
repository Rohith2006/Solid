public class OrderController {
    void create(String id, double amount){
        OrderRepository repo = new SqlOrderRepository();
        repo.save(new Order(id, amount));
        System.out.println("Created order: " + id);
    }
}