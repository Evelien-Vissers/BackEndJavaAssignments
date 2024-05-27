public class Ingredient {
    //Attributen
    private double amount;
    private String unit;
    private String name;


    //Constructor - accepteert 3 parameters om een nieuw 'Ingredient' object te initialiseren:
    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    //Getter en setter methoden - hiermee wordt toegang verkregen tot de vriabelen en wijzigingen aan te brengen in deze variabelen:
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // Methode om de details van het ingredient weer te geven
    public String toString() {
        return amount + " " + unit + " " + name;}



}
