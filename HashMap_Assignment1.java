import java.util.*;

class Tester {
    
    public static List<String> sortSales(Map<String, Integer> sales) {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(sales.entrySet());
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        List<String> sortedNames = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedNames.add(entry.getKey());
        }
        return sortedNames;
    }

    public static void main(String args[]) {
        Map<String, Integer> sales = new HashMap<String, Integer>();
        sales.put("Mathew", 50);
        sales.put("Lisa", 76);
        sales.put("Courtney", 45);
        sales.put("David", 49);
        sales.put("Paul", 49);

        List<String> employees = sortSales(sales);

        System.out.println("Employees in the decreasing order of their sales\n=====================================");
        for (String employeeName : employees) {
            System.out.println(employeeName);
        }
    }
}
