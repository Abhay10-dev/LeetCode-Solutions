class Solution {

    private String alphaMapper(int index){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");
        map.put(7,"G");
        map.put(8,"H");
        map.put(9,"I");
        map.put(10,"J");
        map.put(11,"K");
        map.put(12,"L");
        map.put(13,"M");
        map.put(14,"N");
        map.put(15,"O");
        map.put(16,"P");
        map.put(17,"Q");
        map.put(18,"R");
        map.put(19,"S");
        map.put(20,"T");
        map.put(21,"U");
        map.put(22,"V");
        map.put(23,"W");
        map.put(24,"X");
        map.put(25,"Y");
        map.put(26,"Z");

        return map.get(index);
    }

    private String mapper(StringBuilder sb, int col){

        if(col >= 1 && col <= 26){
            return alphaMapper(col);
        }
        else {
            while(col > 0){
                col-=1;
                int remain = col % 26;
                sb.append(alphaMapper(remain+1));
                col = col / 26;
            }

            return sb.reverse().toString();
        }

    }

    public String convertToTitle(int col) {
 
        if(col <= 0) return null;

        StringBuilder sb = new StringBuilder();

        return mapper(sb, col);
    }
}