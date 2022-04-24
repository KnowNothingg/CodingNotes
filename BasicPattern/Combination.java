package BasicPattern;

import java.util.ArrayList;
import java.util.List;

class Combination {
  // Backtracking method. 
    private List<List<Integer>> res;
    public List<List<Integer>> combine1(int n, int k) {
        res = new ArrayList<>();
      // starting from 1
        backTracking(n, k, 1, new ArrayList<Integer>());    // could also uses LinkedList
        return res;
    }
    
    private  void backTracking(int n, int k, int i, List<Integer> cur) {
        if (cur.size() == k) {
            res.add(new ArrayList<>(cur));  
            return;
        }
                
        for (int j = i; j <= n; j++) {
            cur.add(j);
            backTracking(n, k, j+1, cur); // does not contain duplicate numbers, eg: [1,1] not valid. 
            cur.remove(cur.size() - 1); // LinkedList: cur.removeLast();
        }   
    }
}
