public class Solution {
    public string DestCity(IList<IList<string>> paths) {
        Dictionary<string, int> map = new Dictionary<string, int>();
        for (int i = 0; i < paths.Count; i++){
            for (int j = 0; j < 2; j++){
                string city = paths[i][j];
                if (map.ContainsKey(city)){
                    map[city]++;
                }
                else{
                    map[city] = 1;
                }
            }
        }

        string[] sd = new string[2];
        int top = -1;

        foreach (var city in map.Keys){
            if (map[city] == 1){
                sd[++top] = city;
                if (top == 1)
                    break;
            }
        }

        for (int i = 0; i < paths.Count; i++){
            if (sd[0] == paths[i][0]){
                return sd[1];
            }

            if (sd[1] == paths[i][0]){
                return sd[0];
            }
        }

        return(null);
    }
}
