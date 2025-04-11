public interface ProductRepository extends ElasticsearchRepository<Product, String> {
    List<Product> findByNameContainingOrDescriptionContaining(String name, String desc);
}
