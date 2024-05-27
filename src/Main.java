public class Main {
    public static void main(String[] args) {
        //Maak een nieuw Ingredient object aan
        Ingredient ingredient = new Ingredient (200, "grams", "whiteCasterSugar");

        //Hiermee wordt een nieuw object van de 'ApplePieRecipe'-klasse gemaakt. Wanneer dit object wordt aangemaakt, voert de pc de constructor 'ApplePieRecipe()') uit.
        ApplePieRecipe recipe = new ApplePieRecipe();

        recipe.printRecipe(); //De nieuwe methode wordt aangeroepen, wat zorgt voor het afdrukken van de details van elk ingredient naar de console. Dit helpt de gebruiker om te zien welke ingedienten nodig zijn en in welke hoeveelheden.

        recipe.printIngredients(); //Roept de methode aan om elk ingredient afzonderlijk af te drukken in het formaat "hoeveelheid eenheid naam".

        //Hieronder worden de methoden voor elke stap in het recept 1 voor 1 aangeroepen:
        recipe.preheatOven(); //voorheen: Step 1
        recipe.beatAndDivideEgg(); //voorheen: Step 2
        recipe.prepareDough(); //voorheen: Step 3
        recipe.peelAndSliceApples(); //voorheen: Step 4
        recipe.prepareSpringFormPan(); //voorheen: Step 5
        recipe.coverSpringFormWithDough(); //voorheen: Step 6
        recipe.placingApples(); //voorheen: Step 7
        recipe.rollOutDough(); //voorheen: Step 8
        recipe.placeSticksOfDough(); //voorheen: Step 9
        recipe.placePieInOven(); //voorheen: Step 10
        //Bovenstaande main-methode roept elke methode aan om het volledige recept in stappen uit te voeren.
        //Print de details van het ingredient:
        System.out.print("ingredient");

        //Wijzig de hoeveelheid en print opnieuw
        ingredient.setAmount(250);
        System.out.println("Updated amount: " + ingredient.getAmount() + " " + ingredient.getUnit());

        //Print de volledige details opnieuw uit
        System.out.println(ingredient);
    }
}