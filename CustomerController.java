@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @PostMapping
    public Customer save(@RequestBody Customer customer) {
        return repo.save(customer);
    }

    @GetMapping("/{email}")
    public List<Customer> findByEmail(@PathVariable String email) {
        return repo.findByEmail(email);
    }
}
