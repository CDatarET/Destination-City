class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < paths.size(); i++){
            for(int j = 0; j < 2; j++){
                map.put(paths.get(i).get(j), map.getOrDefault(paths.get(i).get(j), 0) + 1);
            }
        }

        String[] sd = new String[2];
        int top = -1;
        for(String city : map.keySet()){
            if(map.get(city) == 1){
                sd[++top] = city;

                if(top == 1){
                    break;
                }
            }
        }

        for(int i = 0; i < paths.size(); i++){
            if(sd[0].equals(paths.get(i).get(0))){
                return(sd[1]);
            }

            if(sd[1].equals(paths.get(i).get(0))){
                return(sd[0]);
            }
        }

        return(null);       
    }
}
