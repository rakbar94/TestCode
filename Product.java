@Document(indexName = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;

    // getters & setters
}
