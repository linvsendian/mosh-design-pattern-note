package creational.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigManager instance = ConfigManager.getInstance();
        instance.set("name", "jacky");

        System.out.println(instance.get("name"));

    }
}
