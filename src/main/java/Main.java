import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

//    public static void main(String[] args) {
//        List<String> myList =
//                Arrays.asList("a1", "a2", "b1", "c2", "c1");
//        List<String> cs = new ArrayList<>();
//        for (String str : myList) {
//            if(str.charAt(0) == 'c') {
//                cs.add(str);
//            }
////            oaw:
////            if(str.substring(0, 1).equals("c")) {
////                cs.add(str);
////            }
//        }
//        System.out.println(cs);
//        for (int i = 0; i < cs.size(); i++) {
//            cs.set(i, cs.get(i).toUpperCase());
////            oaw:
////            cs.set(i, cs.get(i).replace('c', 'C'));
//        }
//        System.out.println(cs);
//        Collections.sort(cs);
//        System.out.println(cs);
//    }

//    oaw:
    public static void main(String[] args) {
        List<String> myList =
                Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> cs = myList
                .stream()
                .filter(element -> element.charAt(0) == 'c')
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .sorted()
                .collect(Collectors.toList());
        cs.forEach(System.out::println);
//        oaw:
//        cs.forEach(item -> System.out.println(item));
//        oaw:
//        for (String item : cs) {
//            System.out.println(item);
//        }
    }
}
