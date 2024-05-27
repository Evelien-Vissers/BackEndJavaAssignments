//Note to reader: ik heb de ingredienten en de stappen vertaald naar het Engels omdat de titels ("Ingredient", "ApplePieRecipe") ook Engels zijn.

//Hier wordt voor elk van de ingredienten van 'Ingredient' een object geinstantieerd:
public class ApplePieRecipe {
    private final Ingredient unsaltedButter;
    private final Ingredient whiteCasterSugar;
    private final Ingredient selfRaisingFlower;
    private final Ingredient egg;
    private final Ingredient vanillaSugar;
    private final Ingredient salt;
    private final Ingredient sweetAndSourApples;
    private final Ingredient whiteGranulatedSugar;
    private final Ingredient cinnamon;
    private final Ingredient breadCrumbs;

    //AppliePieRecipe Constructor (hier wordt elk Ingredient object geinitialiseerd met de opgegeven hoeveelheden, eenheden en namen):
    public ApplePieRecipe() {
        this.unsaltedButter = new Ingredient (200, "grams", "UnsaltedButter");
        this.whiteCasterSugar = new Ingredient (200, "grams", "WhiteCasterSugar");
        this.selfRaisingFlower = new Ingredient (400, "grams", "SelfRaisingFlower");
        this.egg = new Ingredient (1,"Egg", "Egg");
        this.vanillaSugar = new Ingredient (8, "grams", "VanillaSugar");
        this.salt = new Ingredient (1, "pinch", "salt");
        this.sweetAndSourApples = new Ingredient (1.5, "kilograms", "SweetAndSourApples");
        this.whiteGranulatedSugar = new Ingredient (75, "grams", "WhiteGranulatedSugar");
        this.cinnamon = new Ingredient (15, "grams", "Cinnamon");
        this.breadCrumbs = new Ingredient (15, "grams", "BreadCrumbs");
    }

    //Deze methode print de details van elk ingredient van de ApplePieRecipe:
    public void printRecipe() {
        System.out.println("ApplePieRecipe");
        System.out.println(this.unsaltedButter);
        System.out.println(this.whiteCasterSugar);
        System.out.println(this.selfRaisingFlower);
        System.out.println(this.egg);
        System.out.println(this.vanillaSugar);
        System.out.println(this.salt);
        System.out.println(this.sweetAndSourApples);
        System.out.println(this.whiteGranulatedSugar);
        System.out.println(this.cinnamon);
        System.out.println(this.breadCrumbs);
    }
    //Deze methode print de details van elk ingredient afzonderlijk. De methode wordt onder "main" aangeroepen als recipe.printIngredients();
    public void printIngredients() {
        System.out.println(this.unsaltedButter.getAmount() + " " + this.unsaltedButter.getUnit() + " " + this.unsaltedButter.getName());
        System.out.println(this.whiteCasterSugar.getAmount() + " " + this.whiteCasterSugar.getUnit() + " " + this.whiteCasterSugar.getName());
        System.out.println(this.selfRaisingFlower.getAmount() + " " + this.selfRaisingFlower.getUnit() + " " + this.selfRaisingFlower.getName());
        System.out.println(this.egg.getAmount() + " " + this.egg.getUnit() + " " + this.egg.getName());
        System.out.println(this.vanillaSugar.getAmount() + " " + this.vanillaSugar.getUnit() + " " + this.vanillaSugar.getName());
        System.out.println(this.salt.getAmount() + " " + this.salt.getUnit() + " " + this.salt.getName());
        System.out.println(this.sweetAndSourApples.getAmount() + " " + this.sweetAndSourApples.getUnit() + " " + this.sweetAndSourApples.getName());
        System.out.println(this.whiteGranulatedSugar.getAmount() + " " + this.whiteGranulatedSugar.getUnit() + " " + this.whiteGranulatedSugar.getName());
        System.out.println(this.cinnamon.getAmount() + " " + this.cinnamon.getUnit() + " " + this.cinnamon.getName());
        System.out.println(this.breadCrumbs.getAmount() + " " + this.breadCrumbs.getUnit() + " " + this.breadCrumbs.getName());
    }

    //Voor iedere stap wordt hieronder een public void methode aangemaakt (genaamd stap 1, stap 2, etc).
    //Vervolgens is aan de methode is een meer passende naam gegeven (vraag 9 van de opdracht):
//Tevens wordt een System.out.println in de body van de methode gezet.
    public void preheatOven() {
        System.out.println("Step 1: Preheat the oven to 170 degrees Celsius (upper and lower heat.)");
    }
    public void beatAndDivideEgg() {
        System.out.println("Step 2: Beat the egg and divide it into two parts. One half is for the dough, the other part is for covering the apple pie.");
    }
    public void prepareDough() {
        System.out.println("Step 3: Mix the butter, caster sugar, self-raising flour, half of the egg, vanilla sugar and a pinch of salt into a firm dough and divide it into 3 equal parts.");
    }
    public void peelAndSliceApples() {
        System.out.println("Step 4: Now peel the apples and cut them into slices. Mix the sugar and cinnamon in a cup");
    }
    public void prepareSpringFormPan() {
        System.out.println("Step 5: Grease the spring form pan and sprinkle it with flour");
    }
    public void coverSpringFormWithDough() {
        System.out.println("Step 6: Use some of the dough to cover the bottom of the pan. Use some of the dough to line the edge of the spring form pan. Sprinkle the breadcrumbs on the bottom of the lined tin. The breadcrumbs absorb the moisture from the apples.");
    }
    public void placingApples() {
        System.out.println("Step 7: Place half the apples in the mold and sprinkle 1/3 of the cinnamon-sugar mixture over them. Mix the other half of the apples with the remaining cinnamon-sugar mixture and place in the tin.");
    }
    public void rollOutDough() {
        System.out.println("Step 8: Roll out the last part of the dough into a thin piece and cut strips about 1 cm wide.");
    }
    public void placeSticksOfDough() {
        System.out.println("Step 9:Place the sticks crosswise on the apple pie. Finish the edge all around with some extra strips of dough. Use the remaining egg to brush the top of the dough.");
    }
    public void placePieInOven() {
        System.out.println("Step 10: Place the cake slightly below the center of the oven. Bake the cake for 60 minutes at 170 degrees Celsius (top and bottom heat) until done and golden brown.");
    }

}

