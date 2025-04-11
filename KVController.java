@RestController
@RequestMapping("/kv")
public class KVController {

    @Autowired
    private KVStoreService service;

    @PostMapping
    public void set(@RequestParam String key, @RequestParam String value) {
        service.setValue(key, value);
    }

    @GetMapping
    public String get(@RequestParam String key) {
        return service.getValue(key);
    }
}
