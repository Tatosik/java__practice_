package mirea__lab__22;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorApplication extends JFrame {
    private IDocument document;
    private ICreateDocument documentFactory;

    public EditorApplication(ICreateDocument documentFactory) {
        this.documentFactory = documentFactory;

        // Создание экземпляра приложения
        EditorApplication editor = this;

        // Реализация меню File
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        newMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editor.createNewDocument();
            }
        });

        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editor.openDocument();
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editor.saveDocument();
            }
        });

        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        setJMenuBar(menuBar);
        setTitle("Editor Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void createNewDocument() {
        document = documentFactory.createNew();
        System.out.println("Создан новый документ");
    }

    public void openDocument() {
        document = documentFactory.createOpen();
        System.out.println("Открыт документ");
    }

    public void saveDocument() {
        document.save();
        System.out.println("Документ сохранен");
    }

    public static void main(String[] args) {
        // Создание экземпляра фабрики для TextDocument
        ICreateDocument documentFactory = new CreateTextDocument();

        // Создание экземпляра приложения
        EditorApplication editor = new EditorApplication(documentFactory);
    }
}
