
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public class ProductRepository implements IProductRepositoryInterface {
    @Autowired
    IProductJpaRepository productJpaRepository;

    @Override
    public List<Product> findAll() {
        return this.productJpaRepository.findAll().stream().map(ProductDbModel::adaptToProduct).collect(Collectors.toList());
    }

    @Override
    public Product findById(UUID id) {
        return this.productJpaRepository.findAllById(id).adaptToProduct();
    }

}
