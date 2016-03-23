package oxiorapp.healthapp.entities;

/**
 * Created by BSIT on 3/21/2016.
 */
public class Food {

    private int id;
    private String name;
    private String age;
    private String height;
    private String weight;
    private String food;
    private String bloodType;



    public Food() {
    }

    public Food(String food) {
        this.food = food;
    }

    public Food(int id, String bloodType) {
        this.id = id;
        this.bloodType = bloodType;
    }

    public Food(String name, String age, String height, String weight, String food) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.food = food;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
