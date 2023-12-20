package mirea__lab__22;

public class TextDocument implements IDocument {
    public void open() {
        System.out.println("Открыт текстовый документ");
    }

    public void save() {
        System.out.println("Сохранен текстовый документ");
    }
}
