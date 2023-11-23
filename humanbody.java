abstract class Organ {
    private String name;

    public Organ(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void performFunction();
}

class Mouth extends Organ {
    public Mouth() {
        super("Mouth");
    }

    @Override
    void performFunction() {
        System.out.println(getName() + " is involved in digestion.");
        chewFood();
        mixSaliva();
        tasteFood();
        formBolus();
        initiateSwallowing();
        aidEnzymeAction();
    }

    void chewFood() {
        System.out.println(getName() + " is chewing the food.");
    }

    void mixSaliva() {
        System.out.println("Saliva is mixing with the food in the " + getName() + ".");
    }

    void tasteFood() {
        System.out.println("Taste buds on the tongue are identifying the flavors of the food.");
    }

    void formBolus() {
        System.out.println("The chewed food has formed a cohesive bolus.");
    }

    void initiateSwallowing() {
        System.out.println("Chewing has initiated the swallowing reflex.");
    }

    void aidEnzymeAction() {
        System.out.println("Chewing aids in breaking down food further, exposing more surface area for digestive enzymes.");
    }
}

class Stomach extends Organ {
    public Stomach() {
        super("Stomach");
    }

    @Override
    void performFunction() {
        System.out.println(getName() + " is involved in digestion.");
        storeFood();
        secreteAcid();
        churnContents();
        initiateEmptying();
        displayContents();
    }

    void storeFood() {
        System.out.println(getName() + " is storing the food.");
    }

    void secreteAcid() {
        System.out.println("The stomach is secreting digestive acid to break down food.");
    }

    void churnContents() {
        System.out.println("The stomach's muscles are churning and mixing the food.");
    }

    void initiateEmptying() {
        System.out.println("The stomach is preparing to release partially digested food to the small intestine.");
    }

    void displayContents() {
        System.out.println(getName() + " contains partially digested food and gastric juices.");
    }
}

class SmallIntestine extends Organ {
    public SmallIntestine() {
        super("Small Intestine");
    }

    @Override
    void performFunction() {
        System.out.println(getName() + " is involved in digestion.");
        absorbNutrients();
        transportContents();
        releaseEnzymes();
        displayContents();
    }

    void absorbNutrients() {
        System.out.println("The small intestine is absorbing nutrients from the digested food.");
    }

    void transportContents() {
        System.out.println("The small intestine is transporting the partially digested food forward.");
    }

    void releaseEnzymes() {
        System.out.println("Enzymes are released in the small intestine to further break down nutrients.");
    }

    void displayContents() {
        System.out.println(getName() + " contains partially digested food and absorbed nutrients.");
    }
}

class Pancreas extends Organ {
    public Pancreas() {
        super("Pancreas");
    }

    @Override
    void performFunction() {
        System.out.println(getName() + " is involved in digestion.");
        secreteEnzymes();
        regulateBloodSugar();
        playaroleindigestion();

    }

    void secreteEnzymes() {
        System.out.println("The pancreas is secreting digestive enzymes into the small intestine.");
    }

    void regulateBloodSugar() {
        System.out.println("The pancreas helps regulate blood sugar levels by releasing insulin and glucagon.");
    }

    void playaroleindigestion() {
        System.out.println("The pancreas plays a crucial role in digestion by releasing enzymes and regulating blood sugar.");
    }

}

class Liver extends Organ {
    public Liver() {
        super("Liver");
    }

    @Override
    void performFunction() {
        System.out.println(getName() + " is involved in digestion.");
        produceBile();
        detoxifyBlood();
        storeGlycogen();

    }

    void produceBile() {
        System.out.println("The liver produces bile, which is important for digestion.");
    }

    void detoxifyBlood() {
        System.out.println("The liver detoxifies the blood and processes various nutrients.");
    }

    void storeGlycogen() {
        System.out.println("The liver stores glycogen, a source of energy.");
    }

}

class Gallbladder extends Organ {
    public Gallbladder() {
        super("Gallbladder");
    }

    @Override
    void performFunction() {
        System.out.println(getName() + " is involved in digestion.");
        storeAndReleaseBile();
        concentrateBile();
        assistInFatDigestion();
    }

    void storeAndReleaseBile() {
        System.out.println("The gallbladder stores and releases bile to aid in digestion.");
    }

    void concentrateBile() {
        System.out.println("The gallbladder concentrates bile produced by the liver.");
    }

    void assistInFatDigestion() {
        System.out.println("The gallbladder assists in the digestion of dietary fats.");
    }

}

class Rectum extends Organ {
    public Rectum() {
        super("Rectum");
    }

    @Override
    void performFunction() {
        System.out.println(getName() + " is involved in digestion.");
        storeWaste();
        prepareForElimination();
        eliminateWaste();
    }

    void storeWaste() {
        System.out.println("The rectum stores indigestible waste before elimination.");
    }

    void prepareForElimination() {
        System.out.println("The rectum prepares for waste elimination.");
    }

    void eliminateWaste() {
        System.out.println("Waste is eliminated through the anus.");
    }
}

class Anus extends Organ {
    public Anus() {
        super("Anus");
    }

    @Override
    void performFunction() {
        System.out.println(getName() + " is involved in digestion.");
        controlElimination();
        completeDigestiveProcess();
    }

    void controlElimination() {
        System.out.println("The anus controls the elimination of waste from the body.");
    }

    void completeDigestiveProcess() {
        System.out.println("The anus marks the end of the digestive process.");
    }
}

class DigestiveSystem {
    private Mouth mouth;
    private Stomach stomach;
    private SmallIntestine smallIntestine;
    private Pancreas pancreas;
    private Liver liver;
    private Gallbladder gallbladder;
    private Rectum rectum;
    private Anus anus;

    public DigestiveSystem() {
        mouth = new Mouth();
        stomach = new Stomach();
        smallIntestine = new SmallIntestine();
        pancreas = new Pancreas();
        liver = new Liver();
        gallbladder = new Gallbladder();
        rectum = new Rectum();
        anus = new Anus();
    }

    public void performDigestionProcess() {
        // Call the specific functions for each organ
        
        mouth.performFunction();
        stomach.performFunction();
        smallIntestine.performFunction();
        pancreas.performFunction();
        liver.performFunction();
        gallbladder.performFunction();
        rectum.performFunction();
        anus.performFunction();
    }
}

public class Humanbody {
    public static void main(String[] args) {
        DigestiveSystem digestiveSystem = new DigestiveSystem();
        digestiveSystem.performDigestionProcess();
    }
}
