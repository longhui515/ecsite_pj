
import java.util.UUID;

@ToString
@EqualsAndHashCode
@Getter
public class ProductViewModel {
    private final UUID id;
    private final String productName;
    private final String description;
    private final Integer stockQuantity;

    public ProductViewModel(UUID id, String productName, String description, Integer stockQuantity) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.stockQuantity = stockQuantity;
    }

    public static ProductViewModel adaptToProductVewModel(UUID id,
                                                    String productName, String description, Integer stockQuantity) {
        return new ProductViewModel(
                id, productName, description, stockQuantity
        );
    }
}
