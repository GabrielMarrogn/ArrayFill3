import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Double> arr = new ArrayList<>();

        double a = Double.parseDouble(br.readLine());
        
        for(int i = 0; i < 100; i++){
            arr.add(a);
            a = a/2;
        }

        DecimalFormat decimal = new DecimalFormat("0.0000");

        for(int i = 0; i < 100; i++){
            System.out.println("N[" +i +"] = " +decimal.format(arr.get(i)));
        }
    }
}
