class Permutation {
    private List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited, false);
        backTracking(nums, 0, visited, new LinkedList<Integer>());
        return res;
    }
    
    private void backTracking(int[] nums, int i, boolean[] visited, LinkedList<Integer> cur) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        
        for(int j = 0; j < nums.length; j++) {
            if (visited[j]) continue;
            cur.add(nums[j]);
            visited[j] = true;
            backTracking(nums, j, visited, cur);
            cur.removeLast();
            visited[j] = false;
        }
    }
}
