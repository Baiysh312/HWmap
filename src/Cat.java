public class Cat implements Catable {
    private String name;

    private <T> T meow(T cf){
        return cf;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
