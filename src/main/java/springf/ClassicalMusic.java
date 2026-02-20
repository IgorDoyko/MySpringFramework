package springf;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {
    }
    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Симфония № ";
    }
    public void init(){
        System.out.println("инициализация");
    }
    public void destroy(){
        System.out.println("финиш");
    }
}
