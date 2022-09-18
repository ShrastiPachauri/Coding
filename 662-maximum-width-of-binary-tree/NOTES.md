while(r.right!=null && r.left!=null)
{
if(r.right!=null)
{
r=r.right;
ri++;
if(maxri<ri)
{
maxri=ri;
}
}
else
{
r=r.left;
ri--;
}
}
if(maxri<ri)
{
maxri=ri;
}
return (maxri-minl+1);
//b/c here in width we are counting  all nodes possibility in between
**so ask this assumption well before **
**Indexing of children in 2*i +1 && 2*i+2 **