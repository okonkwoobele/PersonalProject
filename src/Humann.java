public class Humann {
    private String name;
    private int age;

    public Humann(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Humann() {

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
            if (age < 18)throw new IllegalArgumentException("invalid age, please enter a valid price: ");
            else {this.age = age;}
    }
    public int getAge() {

        return age;
    }
}

