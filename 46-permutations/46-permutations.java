class Solution {
    
public void swap(int ind1,int ind2,int[]nums){
int temp=nums[ind1];
nums[ind1]=nums[ind2];
nums[ind2]=temp;

}
 
public List<List<Integer>>permutations(int[]nums,int index,List<List<Integer>>ans){
if(index>=nums.length)return ans;
for(int i=index;i<nums.length;i++){
swap(index,i,nums);
permutations(nums,index+1,ans);
swap(index,i,nums);
}
List<Integer>l=new ArrayList<Integer>();
    for(int x:nums){
        l.add(x);
    }
    ans.add(l);
    return ans;
}
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
permutations(nums,0,ans);
        
        
        HashSet<List<Integer>>hs=new HashSet<List<Integer>>();
        for(int i=0;i<ans.size();i++){
            
            hs.add(ans.get(i));
        }
        ans=new ArrayList<List<Integer>>();
        ans.addAll(hs);
        return ans;
        

    }
}