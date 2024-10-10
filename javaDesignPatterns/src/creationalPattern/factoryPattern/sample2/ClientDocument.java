package creationalPattern.factoryPattern.sample2;

import creationalPattern.factoryPattern.sample2.documentFactory.ExcelDocumentFactory;
import creationalPattern.factoryPattern.sample2.documentFactory.PDFDocumentFactory;
import creationalPattern.factoryPattern.sample2.documentFactory.WordDocumentFactory;
import creationalPattern.factoryPattern.sample2.documentManager.DocumentManager;

import java.util.Scanner;

public class ClientDocument {

    public static void main(String[] args) {

        DocumentManager documentManager = new DocumentManager();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Please enter your choice to create by tying 1/ 2/ 3/ 4      ");

            System.out.println("1. Word Document    ");
            System.out.println("2. PDF Document     ");
            System.out.println("3. Excel Document   ");
            System.out.println("4. View all the current documents existed   ");

            System.out.print("Enter your choice: ");
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    documentManager.addDocument(new WordDocumentFactory());
                    break;
                case 2:
                    documentManager.addDocument(new PDFDocumentFactory());
                    break;
                case 3:
                    documentManager.addDocument(new ExcelDocumentFactory());
                    break;
                case 4:
                    documentManager.showAllExistingDocuments();
                    break;
                default:
                    throw new RuntimeException("User inputted an invalid choice. Program exited!    ");
            }
        }
    }
}
