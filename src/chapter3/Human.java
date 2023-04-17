package chapter3;

public class Human {


    private String humanHeight;
    private String skinColour;
    private String age;

    public void setHumanHeight(String humanHeight) {

        this.humanHeight = humanHeight;
    }
    public String getHumanHeight() {

        return humanHeight;
    }
    public void setSkinColour(String skinColour) {

        this.skinColour = skinColour;
    }
    public String getSkinColour() {

        return skinColour;
    }
    public void setAge(String age) {

        this.age = age;
    }
    public String getAge() {

        return age;
    }
    public Human(String humanHeight, String skinColour, String age) {
        this.humanHeight = humanHeight;
        this.skinColour = skinColour;
        this.age = age;
    }
    public Human() {
    }

    public void Walk(String i_love_to_catWalk) {
    }

    public void talk(String i_talk_in_tougues) {
    }
}
