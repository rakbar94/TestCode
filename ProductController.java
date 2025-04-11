@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return repo.save(product);
    }

    @GetMapping("/search")
    public List<Product> search(@RequestParam String keyword) {
        return repo.findByNameContainingOrDescriptionContaining(keyword, keyword);
    }
}
