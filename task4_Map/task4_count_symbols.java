package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task4_Map;

import java.util.*;

public class task4_count_symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        char[] symbols = word.toCharArray();

        Map<Character,Integer> countSymbols = new HashMap<>();
        TreeMap<Character,Integer> sortedSymbols = new TreeMap<>();
        LinkedHashMap<Character,Integer> orderSymbols = new LinkedHashMap<>();

        for(char symbol:symbols){
            if(countSymbols.containsKey(symbol)){
                countSymbols.put(symbol,countSymbols.get(symbol)+1);
                orderSymbols.put(symbol,orderSymbols.get(symbol)+1);
                sortedSymbols.put(symbol,sortedSymbols.get(symbol)+1);
            }else{
                countSymbols.put(symbol,1);
                orderSymbols.put(symbol,1);
                sortedSymbols.put(symbol,1);
            }
        }
        countSymbols.forEach((character,integer) -> System.out.println("the letter "+character+" is repeating " + integer));
        // if we want to dispaly letters in ascending order we can use TreeMap
        sortedSymbols.forEach((character,integer) -> System.out.println("the letter "+character+" is repeating " + integer));
        // if we want to display letters in the order which they have entered, we can use LinkedHashMap
        orderSymbols.forEach((character,integer) -> System.out.println("the letter "+character+" is repeating " + integer));

    }
}
