import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ReadProductDetailService readProductDetailService;
    @GetMapping("/read/{id}")
    public ProductViewModel findProductById(@PathVariable("id") UUID id) {
        return this.readProductDetailService.readProductById(id);
    }
}
