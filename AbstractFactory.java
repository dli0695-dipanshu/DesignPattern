//Abstract product A
interface Button{
    String click();
}

//Abstract product B
interface TextFields{
    String input();
}

//Concrete products for Light Mode
class LightButton implements Button{
    @Override
    public String click() {
        return "Light Clicked";
    }
}
class LightText implements TextFields{

    @Override
    public String input() {
        return "Light Write Text Here";
    }
}

//Concrete products for Dark Mode
class DarkButton implements Button{

    @Override
    public String click() {
        return "Dark Clicked";
    }
}

class DarkText implements TextFields{

    @Override
    public String input() {
        return "Dark Write Text Here";
    }
}

// Abstract Factory
interface Mode{
    Button createButton();
    TextFields createText();
}

// Concrete Factories
class LightModeFactory implements Mode{
    @Override
    public Button createButton() {
        return new LightButton();
    }
    @Override
    public TextFields createText() {
        return new LightText();
    }
}

class DarkModeFactory implements Mode{
    @Override
    public Button createButton() {
        return new DarkButton();
    }
    @Override
    public TextFields createText() {
        return new DarkText();
    }
}

//Usage
public class AbstractFactory {
    public static void main(String[] args) {
        Mode lightMode = new LightModeFactory();
        Button lightButton = lightMode.createButton();
        TextFields lightText = lightMode.createText();
        System.out.println(lightButton.click());
        System.out.println(lightText.input());

        Mode darkMode = new DarkModeFactory();
        Button darkButton =darkMode.createButton();
        TextFields darkText = darkMode.createText();
        System.out.println(darkButton.click());
        System.out.println(darkText.input());

    }
}
