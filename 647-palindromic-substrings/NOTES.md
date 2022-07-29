public int countSubstrings(String s) {
if(s.length()==0)
return 0;
for(int i=0; i<s.length()-1; i++){
checkPalindrome(s,i,i);     //To check the palindrome of odd length palindromic sub-string
checkPalindrome(s,i,i+1);   //To check the palindrome of even length palindromic sub-string
}
return count;
}
​
private void checkPalindrome(String s, int i, int j) {
while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){    //Check for the palindrome string
count++;    //Increment the count if palindromin substring found
i--;    //To trace string in left direction
j++;    //To trace string in right direction
}
//I was confused at why check(s,i,i) && check(s,i,i+1) both req.
Then check(s,i,i)//for a*b*a
check(s,i,i+1)//for c*b*bc-->only check(s,i,i) will be problematic here b/c in the very next step c and b will be compared