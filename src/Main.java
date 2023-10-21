import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Livro livro = new Livro();

        System.out.println("Digite seu nome:");
        pessoa.setName(sc.nextLine());
        System.out.println("Digite sua idade:");
        pessoa.setAge(sc.nextInt());
        sc.nextLine(); // consumir o caractere \n deixado pelo nextInt()
        System.out.println("Digite seu sexo: ");
        pessoa.setSex(sc.nextLine());
        pessoa.descricaoUsuario();
        pessoa.fazerAniver();

        System.out.println("Qual o título do livro?");
        livro.setTitle(sc.nextLine());
        System.out.println("Qual o autor do livro?");
        livro.setAuthor(sc.nextLine());
        System.out.println("Qual o total de páginas?");
        livro.setTotalPages(sc.nextInt());
        sc.nextLine(); // consumir o caractere de \n
        livro.open();
        livro.read();
        livro.nextPage();
        livro.nextPage();
        livro.previousPage();
    }
}