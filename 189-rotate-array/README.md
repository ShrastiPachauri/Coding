<h2><a href="https://leetcode.com/problems/rotate-array/">189. Rotate Array</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Given an array, rotate the array to the right by <code style="user-select: auto;">k</code> steps, where <code style="user-select: auto;">k</code> is non-negative.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = [1,2,3,4,5,6,7], k = 3
<strong style="user-select: auto;">Output:</strong> [5,6,7,1,2,3,4]
<strong style="user-select: auto;">Explanation:</strong>
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
</pre>

<p style="user-select: auto;"><strong style="user-select: auto;">Example 2:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input:</strong> nums = <lighter data-id="lgt9421970897740035" data-bundle-id="0" data-slot-id="0" style="background-color: rgb(255, 255, 131); user-select: auto;">[-1,-100,3,99</lighter><div class="LinerThreadIcon LinerFirst LinerOwnerThread" data-highlight-id="256655983" data-bundle-id="0" id="lgt256655983" style="background-image: url(&quot;https://profile.getliner.com/liner-service-bucket/user_photo_default/color-2/S.svg&quot;); user-select: auto;">
        <div class="LinerThreadIcon__dim" style="user-select: auto;"></div>
        <div class="LinerThreadIcon__mentioned" style="user-select: auto;">
          <div class="LinerThreadIcon__mentionedImg" style="user-select: auto;"></div>
        </div>
        <div class="LinerThreadIcon__onlyMe" style="user-select: auto;">
          <div class="LinerThreadIcon__onlyMeImg" style="user-select: auto;"></div>
        </div>
      </div>], k = 2
<strong style="user-select: auto;">Output:</strong> [3,99,-1,-100]
<strong style="user-select: auto;">Explanation:</strong> 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= nums.length &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">-2<sup style="user-select: auto;">31</sup> &lt;= nums[i] &lt;= 2<sup style="user-select: auto;">31</sup> - 1</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= k &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
</ul>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Follow up:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;">Try to come up with as many solutions as you can. There are at least <strong style="user-select: auto;">three</strong> different ways to solve this problem.</li>
	<li style="user-select: auto;">Could you do it in-place with <code style="user-select: auto;">O(1)</code> extra space?</li>
</ul>
</div>