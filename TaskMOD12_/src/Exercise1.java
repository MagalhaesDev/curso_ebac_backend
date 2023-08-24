import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os nomes dos usuários");
        String namesAndComma  = sc.nextLine();

        String[] namesWithoutCommaMap = namesAndComma.split(",");

        SortedMap<String, Integer> names =   new TreeMap<>();

        for(int i = 0; i < namesWithoutCommaMap.length; i++) {
            names.put(namesWithoutCommaMap[i], i+1);
        }

        for (SortedMap.Entry<String, Integer> entry : names.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Chave: " + entry.getValue());
        }

        sc.close();


    }
}
