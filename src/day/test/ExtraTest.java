package day.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Result {
    public static List<List<String>> getProductSuggestions(List<String> products, String search) {
        char[] searchChar = search.toCharArray();
        String word = "";
        Collections.sort(products);
        List<List<String>> recomendationList = new ArrayList<>();
        for(int i = 0; i < search.length(); i++) {
            word = word + searchChar[i];
            recomendationList.add(getProducts(products, word));
        }
        System.out.println(recomendationList);
        return recomendationList;
    }

    public static List<String> getProducts(List<String> products, String searchWord) {
        List<String> recommendations = new ArrayList<>();
        for (String product : products) {
            if (recommendations.size() < 3 && product.contains(searchWord)) {
                recommendations.add(product);
            }
        }
        Collections.sort(recommendations);
        return recommendations;
    }
}

public class ExtraTest {
    public static void main(String[] args) throws IOException {
        List<List<String>> result = Result.getProductSuggestions(Arrays.asList("Abacaxi", "Abacate", "Acerola", "Banana"), "Abacaxi");
        System.out.println(result);
    }
}
