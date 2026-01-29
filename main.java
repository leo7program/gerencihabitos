import java.util.*;


public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Database.init();


while (true) {
System.out.println("=== GERENCIADOR DE HÁBITOS ===");
System.out.println("1 - Registrar");
System.out.println("2 - Login");
System.out.println("0 - Sair");
System.out.print("> ");


int op = sc.nextInt(); sc.nextLine();


if (op == 1) {
System.out.print("Usuário: ");
String user = sc.nextLine();
System.out.print("Senha: ");
String pass = sc.nextLine();
UserService.register(user, pass);
}
else if (op == 2) {
System.out.print("Usuário: ");
String user = sc.nextLine();
System.out.print("Senha: ");
String pass = sc.nextLine();


if (UserService.login(user, pass)) {
HabitMenu.start(sc, user);
} else {
System.out.println("Login inválido!\n");
}
}
else if (op == 0) break;
}
}
}
