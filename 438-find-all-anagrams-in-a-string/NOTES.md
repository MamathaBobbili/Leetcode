1.Sliding window technique :
Ex: abcb  ( window ab)
First window : phash= 1 1 0 ..  shash =1 1 0 .... result : 0
Second window : remove left value(a) |  shash 0 1 0...
take right value (c)   |  shash 0 1 1...
* Initialize phash,shash with 26 characters array len
* Window is the p length
* For the first window
* Calculate frequency of each character in String "p" (window) in phash
* Calculate frequency of each character in String "s" (window) in shash First window
* After first window , Compare shash and phash if equal add index to result
* Take next right element  and remove left element from string s
2.Recursion Window Technique :
* Find all anagrams for the given string p using recursion method
* Take all anagrams and check each anagram present in String s,if present add index to result