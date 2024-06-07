@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(CustomerRepository customerRepository, OrderRepository orderRepository) {
        return (args) -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter customer id: ");
            String input = scanner.nextLine();
            
            try {
                Long customerId = Long.parseLong(input);
                Optional<Customer> customer = customerRepository.findById(customerId);

                if (customer.isPresent()) {
                    List<Order> orders = orderRepository.findByCustomerId(customerId);
                    System.out.println("Orders for customer id " + customerId + ":");
                    orders.forEach(order -> System.out.println(order.getDescription()));
                } else {
                    System.out.println("Customer not found.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid customer id.");
            }
        };
    }
}
