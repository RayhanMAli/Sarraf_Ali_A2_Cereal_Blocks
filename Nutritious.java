public class Nutritious {
    private String name; 
private String type; // Could also be char
private int calories; 
private int protein; 
private int fat; 
private int sodium; 
private double fiber; 
private double carbohydrates; 
private int sugar; 
private int potassium; 
private int vitamins; 
private int shelf; 
private double weight; 
private double cups; 
private double rating;
    
    public Nutritious(String name, String type, int calories, int protein, int fat, int sodium,
                      double fiber, double carbohydrates, int sugar, int potassium,
                      int vitamins, int shelf, double weight, double cups, double rating) {
        this.name = name;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbohydrates = carbohydrates;
        this.sugar = sugar;
        this.potassium = potassium;
        this.vitamins = vitamins;
        this.shelf = shelf;
        this.weight = weight;
        this.cups = cups;
        this.rating = rating;
    }
    // Getters for all attributes
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getCalories() {
        return calories;
    }
    public int getProtein() {
        return protein;
    }
    public int getFat() {
        return fat;
    }
    public int getSodium() {
        return sodium;
    }
    public double getFiber() {
        return fiber;
    }
    public double getCarbohydrates() {
        return carbohydrates;
    }
    public int getSugar() {
        return sugar;
    }
    public int getPotassium() {
        return potassium;
    }
    public int getVitamins() {
        return vitamins;
    }
    public int getShelf() {
        return shelf;
    }
    public double getWeight() {
        return weight;
    }
    public double getCups() {
        return cups;
    }
    public double getRating() {
        return rating;
    }

    // Setters for all attributes
    public void setName(String name) {
        this.name = name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void setProtein(int protein) {
        this.protein = protein;
    }
    public void setFat(int fat) {
        this.fat = fat;
    }
    public void setSodium(int sodium) {
        this.sodium = sodium;
    }
    public void setFiber(double fiber) {
        this.fiber = fiber;
    }
    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
    public void setPotassium(int potassium) {
        this.potassium = potassium;
    }
    public void setVitamins(int vitamins) {
        this.vitamins = vitamins;
    }
    public void setShelf(int shelf) {
        this.shelf = shelf;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setCups(double cups) {
        this.cups = cups;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString(Nutritious nutritious) {
        return "Name: " + nutritious.getName() + "\n" +
               "Type: " + nutritious.getType() + "\n" +
               "Calories: " + nutritious.getCalories() + "\n" +
               "Protein: " + nutritious.getProtein() + "\n" +
               "Fat: " + nutritious.getFat() + "\n" +
               "Sodium: " + nutritious.getSodium() + "\n" +
               "Fiber: " + nutritious.getFiber() + "\n" +
               "Carbohydrates: " + nutritious.getCarbohydrates() + "\n" +
               "Sugar: " + nutritious.getSugar() + "\n" +
               "Potassium: " + nutritious.getPotassium() + "\n" +
               "Vitamins: " + nutritious.getVitamins() + "\n" +
               "Shelf: " + nutritious.getShelf() + "\n" +
               "Weight: " + nutritious.getWeight() + "\n" +
               "Cups: " + nutritious.getCups() + "\n" +
               "Rating: " + nutritious.getRating();
       
    }

}