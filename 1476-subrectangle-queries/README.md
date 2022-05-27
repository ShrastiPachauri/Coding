<h2><a href="https://leetcode.com/problems/subrectangle-queries/">1476. Subrectangle Queries</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Implement the class <code style="user-select: auto;">SubrectangleQueries</code>&nbsp;which receives a <code style="user-select: auto;">rows x cols</code> rectangle as a matrix of integers in the constructor and supports two methods:</p>

<p style="user-select: auto;">1.<code style="user-select: auto;">&nbsp;updateSubrectangle(int row1, int col1, int row2, int col2, int newValue)</code></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Updates all values with <code style="user-select: auto;">newValue</code> in the subrectangle whose upper left coordinate is <code style="user-select: auto;">(row1,col1)</code> and bottom right coordinate is <code style="user-select: auto;">(row2,col2)</code>.</li>
</ul>

<p style="user-select: auto;">2.<code style="user-select: auto;">&nbsp;getValue(int row, int col)</code></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Returns the current value of the coordinate <code style="user-select: auto;">(row,col)</code> from&nbsp;the rectangle.</li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["SubrectangleQueries","getValue","updateSubrectangle","getValue","getValue","updateSubrectangle","getValue","getValue"]
[[[[1,2,1],[4,3,4],[3,2,1],[1,1,1]]],[0,2],[0,0,3,2,5],[0,2],[3,1],[3,0,3,2,10],[3,1],[0,2]]
<strong style="user-select: auto;">Output</strong>
[null,1,null,5,5,null,10,5]
<strong style="user-select: auto;">Explanation</strong>
SubrectangleQueries subrectangleQueries = new SubrectangleQueries([[1,2,1],[4,3,4],[3,2,1],[1,1,1]]);  
// The initial rectangle (4x3) looks like:
// 1 2 1
// 4 3 4
// 3 2 1
// 1 1 1
subrectangleQueries.getValue(0, 2); // return 1
subrectangleQueries.updateSubrectangle(0, 0, 3, 2, 5);
// After this update the rectangle looks like:
// 5 5 5
// 5 5 5
// 5 5 5
// 5 5 5 
subrectangleQueries.getValue(0, 2); // return 5
subrectangleQueries.getValue(3, 1); // return 5
subrectangleQueries.updateSubrectangle(3, 0, 3, 2, 10);
// After this update the rectangle looks like:
// 5   5   5
// 5   5   5
// 5   5   5
// 10  10  10 
subrectangleQueries.getValue(3, 1); // return 10
subrectangleQueries.getValue(0, 2); // return 5
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["SubrectangleQueries","getValue","updateSubrectangle","getValue","getValue","updateSubrectangle","getValue"]
[[[[1,1,1],[2,2,2],[3,3,3]]],[0,0],[0,0,2,2,100],[0,0],[2,2],[1,1,2,2,20],[2,2]]
<strong style="user-select: auto;">Output</strong>
[null,1,null,100,100,null,20]
<strong style="user-select: auto;">Explanation</strong>
SubrectangleQueries subrectangleQueries = new SubrectangleQueries([[1,1,1],[2,2,2],[3,3,3]]);
subrectangleQueries.getValue(0, 0); // return 1
subrectangleQueries.updateSubrectangle(0, 0, 2, 2, 100);
subrectangleQueries.getValue(0, 0); // return 100
subrectangleQueries.getValue(2, 2); // return 100
subrectangleQueries.updateSubrectangle(1, 1, 2, 2, 20);
subrectangleQueries.getValue(2, 2); // return 20
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">There will be at most <code style="user-select: auto;"><font face="monospace" style="user-select: auto;">500</font></code>&nbsp;operations considering both methods:&nbsp;<code style="user-select: auto;">updateSubrectangle</code> and <code style="user-select: auto;">getValue</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= rows, cols &lt;= 100</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">rows ==&nbsp;rectangle.length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">cols == rectangle[i].length</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= row1 &lt;= row2 &lt; rows</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= col1 &lt;= col2 &lt; cols</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= newValue, rectangle[i][j] &lt;= 10^9</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= row &lt; rows</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= col &lt; cols</code></li>
</ul>
</div>