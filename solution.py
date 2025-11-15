class Solution:
    def destCity(self, paths):
        d = {}
        for sc in paths:
            for dc in sc:
                d[dc] = d.get(dc, 0) + 1
        
        sd = []
        for x in d:
            if d[x] == 1:
                sd.append(x)
        
        for i in range(len(paths)):
            for j in range(2):
                if sd[0] == paths[i][0]:
                    return sd[1]
                
                if sd[1] == paths[i][0]:
                    return sd[0]
        
