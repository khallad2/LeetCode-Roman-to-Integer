class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
     
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        
        int sum = 0;
        char current  = '\0';
        char[] order= new char[s.length()];
        for(int i=0;i <= s.length()-1; i++){
            current = s.charAt(i);
            order[i] = current;
        }
        char last = '\0';
        for(int x=0; x <= order.length-1; x++){
            if(x == order.length){
                if(map.get(order[x])  <= map.get(last)){
                    System.out.println("sum4 "+ sum);
                    return sum += map.get(order[x]);                                 
                 } else if(map.get(order[x])  > map.get(last)){
                    System.out.println("sum5 "+ sum);
                    return sum += map.get(order[x]) - map.get(last);
                 } 
            } else {
                 if(last == '\0' && x == 0){
                     sum += map.get(order[x]);
                     System.out.println("sum1 "+ sum);
                     x++;
                     last = order[x];
                 } else if(map.get(order[x])  <= map.get(last)){
                     sum += map.get(order[x]);                                 
                     System.out.println("sum2 "+ sum);
                     x++;
                     last = order[x];
                 } else if(map.get(order[x])  > map.get(last)){
                     sum += map.get(order[x]) - map.get(last);
                     x++;
                     last = order[x];
                     System.out.println("sum3 "+ sum);
                 } 
            }
        }
        return sum;
    }
}
