@RestController
@RequestMapping("/produce")
public class ProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private static final String TOPIC = "demo-topic";

    @GetMapping("/{message}")
    public String sendMessage(@PathVariable String message) {
        kafkaTemplate.send(TOPIC, message);
        return "Message sent to Kafka: " + message;
    }
}