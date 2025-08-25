public class SqlOrderRepository implements OrderRepository {
    @Override
    public void save(Order order) {
        System.out.println("Saved order " + order.getId() + " to SQL");
    }
}
