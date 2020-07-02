import com.dietProject.Unit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Ingredient {

    private String name;

    private int kcal;
    private int protein;
    private int carb;
    private int fat;

    private Unit unit;





}
