
@Entity
@Table(name = "products")
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class ProductDbModel implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "description")
    private String description;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "modified")
    private LocalDateTime modified;

    public Product adaptToProduct() {
        return new Product(
                this.id,
                this.productName,
                this.description,
                this.stockQuantity,
                created, modified);
    }

    public static ProductDbModel adaptToProductDbModel(Product product) {
        return new ProductDbModel(product.getId(), product.getProductName(), product.getDescription(), product.stockQuantity(), product.getCreated(), product.getModified());
    }
}
