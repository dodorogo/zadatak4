import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> knjige = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Unesite naslov knjige (ili unesite 'stop' za kraj): ");
            String naslovKnjige = scanner.nextLine();
            if (naslovKnjige.equals("stop")) {
                break;
            }
            System.out.print("Unesite ime autora: ");
            String imeAutora = scanner.nextLine();
            knjige.put(naslovKnjige, imeAutora);
        }

        Set<String> jedinstveneKnjige = new HashSet<>(knjige.keySet());
        List<String> sortiraneKnjige = new ArrayList<>(jedinstveneKnjige);
        Collections.sort(sortiraneKnjige);

        for (String naslovKnjige : sortiraneKnjige) {
            String imeAutora = knjige.get(naslovKnjige);
            System.out.println(naslovKnjige + " od " + imeAutora);
        }
    }
}