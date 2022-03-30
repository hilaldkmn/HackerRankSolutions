# String Introduction
## ❓ Task
You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:
- The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
- The username can only contain alphanumeric characters and underscores ( _ ). Alphanumeric characters describe the character set consisting of lowercase characters [a - z], uppercase characters [A - Z], and digits [0 - 9].
- The first character of the username must be an alphabetic character, i.e., either lowercase character [a - z] or uppercase character [A - Z].
## ⬅️Sample Input
<pre>
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007
</pre>

## ➡️Sample Output
<pre>
Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid
</pre>