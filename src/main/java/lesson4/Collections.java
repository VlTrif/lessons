package lesson4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Collections {
    private Scanner scanner;
    private Map<String, Integer> statistics;

    public Collections(String path) throws FileNotFoundException {
        readFromFile(path);
    }

    public Map<String, Integer> getStatistics() {
        return statistics;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Collections collections = new Collections("C:\\Users\\user\\IdeaProjects\\lessons\\text.txt");

        System.out.println("Words in file: ");
        System.out.println(collections.getStatistics());

        collections.alphabeticalOrdering(collections.getStatistics());

        System.out.println("The most common word: ");
        collections.mostOften(collections.getStatistics());

    }

    void readFromFile(String path) throws FileNotFoundException {
        scanner = new Scanner(new File(path));
        statistics = new HashMap<String, Integer>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count = statistics.get(word);
            if (count == null) {
                count = 0;
            }
            statistics.put(word, ++count);
        }
    }

    void alphabeticalOrdering (Map<String, Integer> statis) {
        Set<String> words = new TreeSet<String>();
        Iterator<Map.Entry<String,Integer>>entryIterator1 = statis.entrySet().iterator();
        while (entryIterator1.hasNext()){
            words.add(entryIterator1.next().getKey());
        }
        System.out.println("Alphabetical order of words");
        System.out.println(words);
    }

    void mostOften (Map<String, Integer> statis) {
        int max = 0;
        String maxKey = null;
        for (String e: statis.keySet()){
            if (statis.get(e) > max) {
                max = statis.get(e);
                maxKey = e;
            }
        }
        System.out.println("word: " + maxKey + ", Value: " + max);
    }
}
