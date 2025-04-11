@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Map<String, Object> getOrder(@PathVariable Long id) {
        Map<String, Object> order = new HashMap<>();
        order.put("orderId", id);
        order.put("product", "Book");

        Map user = restTemplate.getForObject("http://user-service:8081/users/" + id, Map.class);
        order.put("user", user);

        return order;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}