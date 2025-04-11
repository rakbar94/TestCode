@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String name;
    private String email;

    // getters & setters
}