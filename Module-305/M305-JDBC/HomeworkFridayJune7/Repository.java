public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByCustomerId(Long customerId);
}
