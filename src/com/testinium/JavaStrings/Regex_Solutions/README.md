# String Introduction
## ❓ Task
Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address
- IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
- Leading zeros are allowed.
- The length of A, B, C, or D can't be greater than 3.
## ⬅️Sample Input
<pre>
000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
</pre>

## ➡️Sample Output
<pre>
true
true
true
false
false
false
</pre>