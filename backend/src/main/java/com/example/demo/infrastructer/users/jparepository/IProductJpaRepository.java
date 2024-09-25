
import java.util.Optional;
import java.util.UUID;

public interface IProductJpaRepository extends JpaRepository<ProductDbModel, UUID> {
    ProductDbModel findAllById(UUID id);
}
