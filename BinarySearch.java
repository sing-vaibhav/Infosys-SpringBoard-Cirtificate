class Tester {

    public static int searchCustomerId(int customerIds[], int customerIdToBeSearched) {
        for (int i = 0; i < customerIds.length; i++) {
            if (customerIds[i] == customerIdToBeSearched) {
                return i;  // return index if found
            }
        }
        return -1;  // not found
    }
    
    public static void main(String[] args) {
        int[] customerIds = { 80451, 80462, 80465, 80479, 80550, 80561, 80665, 80770 };
        int customerIdToBeSearched = 80462;

        int index = searchCustomerId(customerIds, customerIdToBeSearched);
        
        if (index == -1)
            System.out.println("Customer Id " + customerIdToBeSearched + " is not found!");
        else
            System.out.println("Customer Id " + customerIdToBeSearched + " is found at index position " + index + "!");
    }
}
