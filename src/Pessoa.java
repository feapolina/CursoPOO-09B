public class Pessoa {
    private String name;
    private Integer age;
    private String sex;

    public Pessoa(){
        this.name = null;
        this.age = null;
        this.sex = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void descricaoUsuario(){
        System.out.println("Nome: " + getName());
        System.out.println("Idade: " + getAge());
        System.out.println("Sexo: " + getSex());
    }

    public void fazerAniver(){
        this.age += 1;
        System.out.println("Você fez aniversário! Parabéns pelos seus " + getAge() + " anos!");

    }
}
