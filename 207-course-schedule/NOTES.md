//dfs array is im b/cwe may get same vertices along diff path but not cycle like
5
[[1,4],[2,4],[3,1],[3,2]]
​
here 1 and 2 both are dependent on 4 ,not cycle b/c both are pointing to same vertex cycle become when arrows are cyclic .Ihis is directed graph question b/c even in test case [0,1] and [1,0] are counted different.
​
​
if(visited[x]==0)//if using dfsvisited ,ythen tle b/c all path wil be explored