### Rand Pin Gen


Approach:

Divide number range into two parts,  
ex: if min is 1000 and max is 9999  and batch size is 1000

1. 1000 - 8999
2. 8999 - 9999

Then generate a random number from first block and check if its already used using a tracking array  
If already used return a sequential number from 2nd block


- Space complexity: O(n) n: max value
- Time complexity: O(m) m: batch size

Usage:

`RandomPinGenerator generator = new RandomPinGenerator();`  
`int[] result = generator.getNext(1000, 1000, 9999);`
