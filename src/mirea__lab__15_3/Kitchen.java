package mirea__lab__15_3;

class Kitchen {
    public String makeSandwich(String sandwichType) {
        if ("Cheeseburger".equalsIgnoreCase(sandwichType)) {
            return "Cheeseburger is ready!";
        } else if ("Hamburger".equalsIgnoreCase(sandwichType)) {
            return "Hamburger is ready!";
        } else {
            return "Unknown sandwich type";
        }
    }
}
