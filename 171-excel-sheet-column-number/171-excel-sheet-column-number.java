class Solution {
    public int titleToNumber(String columnTitle) {
        if (columnTitle == null) return -1;
        // int sum = 0;
        // // for each loop so we don't need to mess with index values.
        // for (char c : columnTitle.toUpperCase().toCharArray()) {
        //     sum *= 26;
        //     sum += c - 'A' + 1;
        // }
        // return sum;
        int result = 0;
        for(int i = 0 ; i < columnTitle.length(); i++) {
          result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;

        /** Logic
        
        "B" = 2
        "BC" = (2)26 + 3
        "BCM" = (2(26) + 3)26 + 13
        **/
    }
}