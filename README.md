# string-minimizer

This problem is a kind of code minimiser/compressor. It takes an input string and replaces identifiers with shorter ones. You will write a function that takes as input a string containing the source code and finds and replaces duplicate identifiers and returns the resulting string.

You do not need to handle file input/output. For the purposes of this exercise an identifier is a string of letters (only). For example, "alice" is a single identifier while "jump4joy" is the identifier "jump", the non-identifier "4" and a second identifier "joy".

The second and subsequent times each identifier appears it is replaced by a dollar sign and a number which is the index of the first appearance of that identifier, counting the first identifier as 0, the next as 1, etc. 
Anything that is not an identifier is output as is and you do not need to parse the non-identifier parts. For example:

### minimise("you say yes, I say no you say stop and I say go go go")
### =>
### "you say yes, I $1 no $0 $1 stop and $3 $1 go $12 $12"



## Testing ##

JUnit testing framework used - tests are run from TestStringMinimizer class
