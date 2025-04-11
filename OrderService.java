@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderReportDTO> getOrderReport(Date startDate, Date endDate) {
        List<Object[]> rawResults = orderRepository.getOrderReport(startDate, endDate);

        return rawResults.stream()
            .map(row -> new OrderReportDTO(
                (String) row[0],
                (String) row[1],
                ((Number) row[2]).intValue(),
                ((Number) row[3]).doubleValue()
            ))
            .collect(Collectors.toList());
    }
}