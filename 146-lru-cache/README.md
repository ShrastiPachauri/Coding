<h2><a href="https://leetcode.com/problems/lru-cache/">146. LRU Cache</a></h2><h3>Medium</h3><hr><div style="user-select: auto;"><p style="user-select: auto;">Design a data structure that follows the constraints of a <strong style="user-select: auto;"><a href="https://en.wikipedia.org/wiki/Cache_replacement_policies#LRU" target="_blank" style="user-select: auto;">Least Recently Used (LRU) cache</a></strong>.</p>

<p style="user-select: auto;">Implement the <code style="user-select: auto;">LRUCache</code> class:</p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">LRUCache(int capacity)</code> Initialize the LRU cache with <strong style="user-select: auto;">positive</strong> size <code style="user-select: auto;">capacity</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">int get(int key)</code> Return the value of the <code style="user-select: auto;">key</code> if the key exists, otherwise return <code style="user-select: auto;">-1</code>.</li>
	<li style="user-select: auto;"><code style="user-select: auto;">void put(int key, int value)</code> Update the value of the <code style="user-select: auto;">key</code> if the <code style="user-select: auto;">key</code> exists. Otherwise, add the <code style="user-select: auto;">key-value</code> pair to the cache. If the number of keys exceeds the <code style="user-select: auto;">capacity</code> from this operation, <strong style="user-select: auto;"><lclighter data-id="lgt262040618" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;">evict</lclighter></strong><lclighter data-id="lgt262040618" data-bundle-id="0" style="background-image: linear-gradient(transparent 0%, transparent calc(50% - 4px), rgb(204, 242, 241) calc(50% - 4px), rgb(204, 242, 241) 100%); transition: background-position 120ms ease-in-out 0s, padding 120ms ease-in-out 0s; background-size: 100% 200%; background-position: initial; user-select: auto;"> the least recently used key.</lclighter><div class="LinerThreadIcon LinerFirst " data-highlight-id="262040618" data-bundle-id="0" id="lgt262040618" style="background-image: url(&quot;https://photo.getliner.com/liner-service-bucket/user_photo_default/color-2/D.svg&quot;); user-select: auto;">
        <div class="LinerThreadIcon__dim" style="user-select: auto;"></div>
        <div class="LinerThreadIcon__mentioned" style="user-select: auto;">
          <div class="LinerThreadIcon__mentionedImg" style="user-select: auto;"></div>
        </div>
        <div class="LinerThreadIcon__onlyMe" style="user-select: auto;">
          <div class="LinerThreadIcon__onlyMeImg" style="user-select: auto;"></div>
        </div>
      </div></li>
</ul>

<p style="user-select: auto;">The functions <code style="user-select: auto;">get</code> and <code style="user-select: auto;">put</code> must each run in <code style="user-select: auto;">O(1)</code> average time complexity.</p>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Example 1:</strong></p>

<pre style="user-select: auto;"><strong style="user-select: auto;">Input</strong>
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
<strong style="user-select: auto;">Output</strong>
[null, null, null, 1, null, -1, null, -1, 3, 4]

<strong style="user-select: auto;">Explanation</strong>
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4
</pre>

<p style="user-select: auto;">&nbsp;</p>
<p style="user-select: auto;"><strong style="user-select: auto;">Constraints:</strong></p>

<ul style="user-select: auto;">
	<li style="user-select: auto;"><code style="user-select: auto;">1 &lt;= capacity &lt;= 3000</code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= key &lt;= 10<sup style="user-select: auto;">4</sup></code></li>
	<li style="user-select: auto;"><code style="user-select: auto;">0 &lt;= value &lt;= 10<sup style="user-select: auto;">5</sup></code></li>
	<li style="user-select: auto;">At most <code style="user-select: auto;">2 * 10<sup style="user-select: auto;">5</sup></code> calls will be made to <code style="user-select: auto;">get</code> and <code style="user-select: auto;">put</code>.</li>
</ul>
</div>