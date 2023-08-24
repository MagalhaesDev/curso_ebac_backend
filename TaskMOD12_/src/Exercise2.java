import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes e sexos");
        String namesAndComma  = sc.nextLine();
        String[] namesWithoutCommaMap = namesAndComma.split(",");
        SortedMap<String, String> names =   new TreeMap<>();

        for (int i = 0; i < namesWithoutCommaMap.length; i+= 2) {
            String name = namesWithoutCommaMap[i];
            String gender = i + 1 < namesWithoutCommaMap.length ? namesWithoutCommaMap[i + 1] : "";
            names.put(name, gender);
        }

        System.out.println("Nomes Masculinos:");
        for (SortedMap.Entry<String, String> entry : names.entrySet()) {
            if (entry.getValue().equals("M")) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("Nomes Femininos:");
        for (SortedMap.Entry<String, String> entry : names.entrySet()) {
            if (entry.getValue().equals("F")) {
                System.out.println(entry.getKey());
            }
        }


        sc.close();
    }
}
