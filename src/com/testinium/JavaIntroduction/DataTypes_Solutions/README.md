# Data Types
## ❓ Task
This exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long)
- A byte is an 8-bit signed integer.
- A short is a 16-bit signed integer.
- An int is a 32-bit signed integer.
- A long is a 64-bit signed integer.

Given an input integer, you must determine which primitive data types are capable of properly storing that input.
## ⬅️Sample Input
<pre>
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
</pre>

## ➡️Sample Output
<pre>
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
</pre>