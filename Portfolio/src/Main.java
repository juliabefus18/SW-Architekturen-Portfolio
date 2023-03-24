import de.dhbw.ka.se2.vecto4j.input.VehicleInput;
import com.fasterxml.jackson.core.*;

public class Main {
    public static void main(String[] args) {
        VehicleInput vi = new VehicleInput();
        vi.setWeight(1000);
        System.out.println("weight = " + vi.getWeight());
    }
}