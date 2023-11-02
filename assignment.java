interface AbstractHuman {
    void display();
    void healthStatus();
}

class Human implements AbstractHuman {
    private String name;
    private int age;
    private String bloodGroup;
    private double height;
    private double weight;

    public Human(String name, int age, String bloodGroup, double height, double weight) {
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.height = height;
        this.weight = weight;
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Height: " + height + " cm");
        System.out.println("Weight: " + weight + " kg");
    }

    @Override
    public void healthStatus() {
        System.out.println(name + " has a normal health status.");
    }
}

class SugarLevelInfo extends Human {
    private double sugarLevel;

    public SugarLevelInfo(String name, int age, String bloodGroup, double height, double weight, double sugarLevel) {
        super(name, age, bloodGroup, height, weight);
        this.sugarLevel = sugarLevel;
    }

    public double getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(double sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Sugar Level: " + sugarLevel + " mg/dL");
    }

    @Override
    public void healthStatus() {
        if (sugarLevel > 100) {
            System.out.println(getName() + " has high sugar levels.");
        } else {
            System.out.println(getName() + " has normal sugar levels.");
        }
    }
}

class BloodPressureInfo extends Human {
    private int systolic;
    private int diastolic;

    public BloodPressureInfo(String name, int age, String bloodGroup, double height, double weight, int systolic, int diastolic) {
        super(name, age, bloodGroup, height, weight);
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Blood Pressure: " + systolic + "/" + diastolic + " mmHg");
    }

    @Override
    public void healthStatus() {
        if (systolic > 120 || diastolic > 80) {
            System.out.println(getName() + " has high blood pressure.");
        } else {
            System.out.println(getName() + " has normal blood pressure.");
        }
    }
}

public class Assignement2 {
    public static void main(String[] args) {
        SugarLevelInfo person1 = new SugarLevelInfo("Alice", 30, "A+", 160.5, 55.0, 120.0);
        BloodPressureInfo person2 = new BloodPressureInfo("Bob", 40, "B-", 175.0, 70.0, 120, 80);

        person1.display();
        person1.healthStatus();

        person2.display();
        person2.healthStatus();
    }
}

