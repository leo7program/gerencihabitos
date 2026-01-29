import java.util.*;


class HabitMenu {
private static List<String> habits = new ArrayList<>();


public static void start(Scanner sc, String user) {
while (true) {
System.out.println("\n=== HÁBITOS DE " + user + " ===");
System.out.println("1 - Criar hábito");
System.out.println("2 - Listar hábitos");
System.out.println("0 - Logout");
System.out.print("> ");


int op = sc.nextInt(); sc.nextLine();


if (op == 1) {
System.out.print("Nome do hábito: ");
habits.add(sc.nextLine());
}
else if (op == 2) {
for (int i = 0; i < habits.size(); i++) {
System.out.println((i+1) + " - " + habits.get(i));
}
}
else if (op == 0) break;
}
}
}
