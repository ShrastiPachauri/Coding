<h2><a href="https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/">1653. Minimum Deletions to Make String Balanced</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">You are given a string <code style="user-select: auto;">s</code> consisting only of characters <code style="user-select: auto;">'a'</code> and <code style="user-select: auto;">'b'</code>​​​​.</p>

<p style="user-select: auto;">You can delete any number of characters in <code style="user-select: auto;">s</code> to make <code style="user-select: auto;">s</code> <strong style="user-select: auto;">balanced</strong>. <code style="user-select: auto;">s</code> is <strong style="user-select: auto;">balanced</strong> if there is no pair of indices <code style="user-select: auto;">(i,j)</code> such that <code style="user-select: auto;">i &lt; j</code> and <code style="user-select: auto;">s[i] = 'b'</code> and <code style="user-select: auto;">s[j]= 'a'</code>.</p>

<p style="user-select: auto;">Return <em style="user-select: auto;">the <strong style="user-select: auto;">minimum</strong> number of deletions needed to make </em><code style="user-select: auto;">s</code><em style="user-select: auto;"> <strong style="user-select: auto;">balanced</strong></em>.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "aababbab"
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> You can either:
Delete the characters at 0-indexed positions 2 and 6 ("aa<u style="user-select: auto;">b</u>abb<u style="user-select: auto;">a</u>b" -&gt; "aaabbb"), or
Delete the characters at 0-indexed positions 3 and 6 ("aab<u style="user-select: auto;">a</u>bb<u style="user-select: auto;">a</u>b" -&gt; "aabbbb").
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> s = "bbaaaaabb"
<strong style="user-select: auto;">Output:</strong> 2
<strong style="user-select: auto;">Explanation:</strong> The only solution is to delete the first two characters.
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= s.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">s[i]</code> is&nbsp;<code style="user-select: auto;">'a'</code> or <code style="user-select: auto;">'b'</code>​​.</li>
</ul>
</div>