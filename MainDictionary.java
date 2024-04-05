import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;

public class MainDictionary {

    public static void main(String[] args) {
        Comparator<String> stringComparator = Comparator.naturalOrder();
        BinarySearchTree bstEnglish = new BinarySearchTree(stringComparator);
        BinarySearchTree bstSpanish = new BinarySearchTree(stringComparator);
        BinarySearchTree bstFrench = new BinarySearchTree(stringComparator);

        //Process for binary tree in english
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Documentos UVG\\diccionario.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] components = line.split(",");
                Association englishAssociation = new Association(components[0],components);
                System.out.println(englishAssociation.getValue());
                bstEnglish.insert(components[0],englishAssociation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Process for binary tree in spanish
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Documentos UVG\\diccionario.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] components = line.split(",");
                Association spanishAssociation = new Association(components[1],components);
                bstSpanish.insert(components[1],spanishAssociation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Process for binary tree in french
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Documentos UVG\\diccionario.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] components = line.split(",");
                Association frenchAssociation = new Association(components[2],components);
                bstFrench.insert(components[2],frenchAssociation);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ShowDictionaryWalk showEnglish = new ShowDictionaryWalk();
        bstEnglish.InOrderWalk(showEnglish);
        ShowDictionaryWalk showSpanish = new ShowDictionaryWalk();
        bstSpanish.InOrderWalk(showSpanish);
        ShowDictionaryWalk showFrench = new ShowDictionaryWalk();
        bstFrench.InOrderWalk(showFrench);
    }
}
