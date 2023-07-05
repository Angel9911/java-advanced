package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task4_Map;

import java.util.*;
import java.util.stream.Collectors;

public class task7_hands_cards {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> players = new LinkedHashMap<>();
        Set<String> setCards;

        String input = scanner.nextLine();
        while (!input.equals("joker")){

            String usernamePlayer = input.split(":\\s+")[0];
            String cards = input.split(":\\s+")[1];

            setCards = new HashSet<>();

            String[] getArrayCards = cards.split(", ");

            setCards.addAll(Arrays.asList(getArrayCards));

            if(players.containsKey(usernamePlayer)){

                Set<String> getExistingCards = players.get(usernamePlayer);
                getExistingCards.addAll(setCards);
                players.put(usernamePlayer,getExistingCards);
            }else {

                players.put(usernamePlayer, setCards);
            }
            input = scanner.nextLine();
        }

        players.entrySet()
                .forEach(entry -> {
                        String getPlayerName = entry.getKey();
                        Set<String> getCards = entry.getValue();
                        int points = getCardsPoints(getCards);
                        System.out.printf(" %s : %d",getPlayerName,points);});

        System.out.println("Display player names");
        System.out.println(players.entrySet()
                .stream()
                .map(stringSetEntry -> stringSetEntry.getKey())
                .collect(Collectors.toList()));

    }
    public static int getCardsPoints(Set<String> cards){
        int sumPoints = 0;
        Map<Character, Integer> symbolValues = getSymbolValues();
        for(String card : cards){
            int points = 0;
            char[] strengthType = card.toCharArray();

            if(card.startsWith("10")){

                char type = strengthType[2];// or card.charAt(2);
                points = 10 * symbolValues.get(type);
            }else{

                char power = card.charAt(0);
                char type = card.charAt(1);
                points = symbolValues.get(power) * symbolValues.get(type);
            }
            sumPoints = sumPoints + points;
        }
        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolValues() {
        Map<Character, Integer> charactersValues = new HashMap<>();

        charactersValues.put('2',2);
        charactersValues.put('3',3);
        charactersValues.put('4',4);
        charactersValues.put('5',5);
        charactersValues.put('6',6);
        charactersValues.put('7',7);
        charactersValues.put('8',8);
        charactersValues.put('9',9);

        charactersValues.put('J',11);
        charactersValues.put('Q',11);
        charactersValues.put('K',11);
        charactersValues.put('A',14);

        // for types
        charactersValues.put('S',4);
        charactersValues.put('H',3);
        charactersValues.put('D',2);
        charactersValues.put('C',1);

        return charactersValues;
    }
}
