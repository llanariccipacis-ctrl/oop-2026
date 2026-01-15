public class Mug {
    String component;
    String color;

    void printDetails(){

        System.out.printf("""
                %s %s
                """, component, color);
    }
}
