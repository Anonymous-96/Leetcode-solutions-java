class PascalTriangle_Leetcode_118 {
    public List<Integer> generateRow(int row){
        int ans=1;
        List<Integer> ansRow= new ArrayList<>();
        ansRow.add(1);
        for(int col=1;col<row;col++){
            //Logic-->
            ans = ans * (row-col);
            ans=ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            //Adding each row in final answer
            ans.add(generateRow(i));
        }
        return ans;
    }
}