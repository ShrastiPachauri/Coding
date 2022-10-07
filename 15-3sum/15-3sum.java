class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
     HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        HashSet<List<Integer>> hs=new HashSet<List<Integer>>();
       Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length;i++){
           
            int v=nums[i];
            
            int target=-nums[i];
          
            int h=nums.length-1;
             for(int l=i+1;l<h;){
                    
                    if(nums[l]+nums[h]==target )
                        {
                            List<Integer> list=new ArrayList<Integer>();
                            list.add(nums[i]);
                            list.add(nums[l]);
                            list.add(nums[h]);
                        Collections.sort(list);
                        hs.add(list);
                          
                        }
                        
                    if((nums[l]+nums[h])<target){
                        l++;
                    }
                    else{
                        h--;
                    }
                }
                
                
            }
        
        
        for(List<Integer> l:hs){
            ans.add(l);
        }
            
            return ans; 
        }
        
        
       
        
    }
