ch array traversal and their TLE
1.tried hashmap and values to list whose count ===matrix.length //2*O(n2)
2.Two HashSet ,one containing values of first array and second containing subsequent array values again O(n2) and changing hashset by assigning new hashset to it
​
​
//solution from discuss
​
same logic as 1...but it made a hashtable of array[1001] and O(n2) for putting but O(n) from filtering (Enhance for loop used).also due to index based values traversing ans is sorted alredy:}