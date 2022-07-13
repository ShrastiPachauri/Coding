TreeNode front=dq.peek();
sum+=front.val;
if(front.left!=null)
{
dq.push(front.left);
}
if(front.right!=null)
{
dq.push(front.right);
}
dq.pollFirst();
}
ans.add(sum/s);
}
return ans;
}`
PS: push in ArrayDeque add element at firs ,so used addLast instead