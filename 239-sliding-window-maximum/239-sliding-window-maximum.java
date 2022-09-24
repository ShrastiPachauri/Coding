class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int[]ans=new int[arr.length-k+1];
Deque<Integer>dq=new ArrayDeque<Integer>();

int in=0;

for(int i=0;i<arr.length;i++){
    
if(!dq.isEmpty() && dq.peek()==i-k){
dq.poll();
}
while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]){
dq.pollLast();
}

    dq.offer(i);

    if(i>=k-1){
        ans[in++]=arr[dq.peek()];
    }

}
return ans;
}

    }
