class Solution {
    int solve(TreeNode root,List<Integer> lt){
        if(root==null){
            return 0;
        }
        int ans = 0;
        Collections.sort(lt);
        if(root.val>=lt.get(lt.size()-1)){
            lt.add(root.val);
            ans++;
        }
        List<Integer> st = new ArrayList(lt);
        if(root.left!=null){
            ans += solve(root.left,lt);
            
        }
        if(root.right!=null){
            ans += solve(root.right,st);
        }
        return ans;
    }
    public int goodNodes(TreeNode root) {
        List<Integer> lt = new ArrayList();
        lt.add(root.val);
        return solve(root,lt);
    }
}
