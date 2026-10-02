class Solution {
    public String reverseVowels(String s) {

        char[] array = s.toCharArray();
        int first = 0;
        int second = array.length-1;

        while(first < second){

            while(first < second && !isVowel(array[first])){
                first++;
            }

            while(first < second && !isVowel(array[second])){
                second--;
            }

            if(first < second){
                char temp = array[first];
                array[first] = array[second];
                array[second] = temp;

                first++;
                second--;
            }
        }

        return new String(array);
    }

    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}