public class Livro implements Publicacao{
    private String title;
    private String author;
    private int totalPages;
    private int atualPage = 0;
    private boolean open = false;
    private Pessoa pessoa;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getAtualPage() {
        return atualPage;
    }

    public void setAtualPage(int atualPage) {
        this.atualPage = atualPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void detalhes(){
        System.out.println("Título: " + getTitle());
        System.out.println("Autor: " + getAuthor());
        System.out.println("Total de páginas: " + getTotalPages());
        System.out.println("Página atual: " + getAtualPage());
        System.out.println("O livro está aberto? " + isOpen());
        System.out.println("Leitor: " + pessoa.getName());
    }

    @Override
    public void open() {
        if (isOpen()){
            System.out.println("O livro já está aberto.");
        } else{
            this.setOpen(true);
            System.out.println("Você abriu o livro.");
        }
    }

    @Override
    public void close() {
        if (!isOpen()){
            System.out.println("O livro já está fechado.");
        } else {
            this.setOpen(false);
            System.out.println("Você fechou o livro.");
        }

    }

    @Override
    public void read() {
        if (isOpen()){
            System.out.println("Lendo a página " + getAtualPage() + "...");
        } else{
            System.out.println("Você não pode ler com o livro fechado.");
        }

    }

    @Override
    public void nextPage() {
        this.setAtualPage(atualPage += 1);
        System.out.println("Página atual: " + getAtualPage());
    }

    @Override
    public void previousPage() {
        this.setAtualPage(atualPage -= 1);
        System.out.println("Página atual: " + getAtualPage());
    }
}
