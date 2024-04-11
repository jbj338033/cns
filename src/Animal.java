public class Animal {
    private String name;
    private String gender;

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void mCry() {
        System.out.println("이름: " + name + " 성별: " + gender + " asdfasdf");
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}
