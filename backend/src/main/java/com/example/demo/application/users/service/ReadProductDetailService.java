
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ReadProductDetailService {
    @Autowired
    IProductRepositoryInterface productRepository;

    @Transactional
    public ProductViewModel readProductById(UUID id) {
        Product product =
                this.productRepository.findById(id);

        return ProductViewModel.adaptToProductVewModel(product.getId(), product.getProductName(), product.getDescription(),
                product.getStockQuantity());
    }

}
