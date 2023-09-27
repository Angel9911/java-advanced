package interview_tasks_paysafe.object_oriented.softuni.java_advanced.task7_set_map_labs.map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContinentCountries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, ArrayList<String>>> contentCountries = new LinkedHashMap<>();
        int countRecords = Integer.parseInt(scanner.nextLine());

        for(int i=0;i<countRecords;i++){

            String[] readInput = scanner.nextLine().split("\\s+");

            String continentName= readInput[0];
            String countryName = readInput[1];
            String cityName = readInput[2];

            if(contentCountries.containsKey(continentName)){

                Map<String, ArrayList<String>> existingCountriesCities = contentCountries.get(continentName);

                if(existingCountriesCities.containsKey(countryName)){

                    ArrayList<String> existingCities = existingCountriesCities.get(countryName);
                    existingCities.add(cityName);
                    existingCountriesCities.put(countryName,existingCities);
                }else{

                    ArrayList<String> cityList = new ArrayList<>();
                    cityList.add(cityName);
                    existingCountriesCities.put(countryName,cityList);
                }

                contentCountries.put(continentName,existingCountriesCities);
            }else{

                Map<String, ArrayList<String>> countryCities = new LinkedHashMap<>();

                ArrayList<String> cities = new ArrayList<>();
                cities.add(cityName);

                countryCities.put(countryName,cities);
                contentCountries.put(continentName,countryCities);
            }
        }

        contentCountries.forEach((continentName, countries) -> {
            System.out.println(continentName+":");

            countries.forEach((country,cities) ->{


                String printCities = cities.stream().collect(Collectors.joining(", "));

                System.out.printf(" %s -> %s",country, printCities);
                System.out.println();
            });

        });

    }
}
