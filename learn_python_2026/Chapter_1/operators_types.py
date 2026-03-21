#Types of Operators
ARITHMETIC_OPERATORS = ['+', '-', '*', '/', '%', '**', '//']
COMPARISON_OPERATORS = ['==', '!=', '>', '<', '>=', '<=']
ASSIGNMENT_OPERATORS = ['=', '+=', '-=', '*=', '/=', '%=', '**=', '//=']
LOGICAL_OPERATORS = ['and', 'or', 'not']
BITWISE_OPERATORS = ['&', '|', '^', '~', '<<', '>>']
MEMBERSHIP_OPERATORS = ['in', 'not in']
IDENTITY_OPERATORS = ['is', 'is not']

ALL_OPERATORS = (ARITHMETIC_OPERATORS + COMPARISON_OPERATORS + ASSIGNMENT_OPERATORS +
                 LOGICAL_OPERATORS + BITWISE_OPERATORS + MEMBERSHIP_OPERATORS +
                 IDENTITY_OPERATORS)



def get_operator_type(operator):
    if operator in ARITHMETIC_OPERATORS:
        return 'Arithmetic Operator'
    elif operator in COMPARISON_OPERATORS:
        return 'Comparison Operator'
    elif operator in ASSIGNMENT_OPERATORS:
        return 'Assignment Operator'
    elif operator in LOGICAL_OPERATORS:
        return 'Logical Operator'
    elif operator in BITWISE_OPERATORS:
        return 'Bitwise Operator'
    elif operator in MEMBERSHIP_OPERATORS:
        return 'Membership Operator'
    elif operator in IDENTITY_OPERATORS:
        return 'Identity Operator'
    else:
        return 'Unknown Operator'
    


    
# Example usage:
# print(get_operator_type('+'))  # Output: Arithmetic Operator
# print(get_operator_type('and'))  # Output: Logical Operator
# print(get_operator_type('is'))  # Output: Identity Operator
# print(get_operator_type('>>'))  # Output: Bitwise Operator
# print(get_operator_type('xyz'))  # Output: Unknown Operator
# Practice
# State True or False for each of the following statements:
# Ques 1) /* is a symbol used in Python for single line  comment.
# Ans) False
# Ques 2) 2ndNAme is an invalid identifier in Python.
# Ans) True
# Ques 3) ** is valid arithmethic operator in python.
# Ans) True
#Ques 4)  in is a logical operator in Python.
# Ans) True
# Ques 5) Variable declaration is implicit in Python.
# Ans) True
# Ques 6) Remainder is negative when denominator is negative.
# Ans) True but depends on numerator also must be positive.
# Arithmetic Operators in Python
A,B = 7,2
C = A+B

print(C)
# Output: 9
C = A-B
print(C)
# Output: 5
C = A*B
print(C)


# Output: 14
C = A/B
print(C)
# Output: 3.5
C = A%B
print(C)
# Output: 1
C = A**B
print(C)
# Output: 49
C = A//B
print(C)
# Output: 3
A,B = -7,2
C = A//B
print(C, A/B)
# Output: -4.0
A,B = 7,-2
C = A//B
print(C, A/B)
# Output: -4.0
A,B = -7,-2
C = A//B

print(C, A/B)
# Output: 3.0
# Floor division always rounds down to the nearest integer
A,B = 7,2
C = A//B
print(C, A/B)
# Output: 3 3.5
# Integer division with float and int will give int displayed as float
A,B = 7.0,2
C = A//B
print(C, A/B)
# Output: 3.0 3.5
# floor gives closest integer, which is lesser than or equal to the float value result of (A//B)  is same as floor(A//B)
A,B = -7.0,2
C = A//B
print(C, A/B)

# Output: -4.0 -3.5
A,B = 7.0,-2    
C = A//B
print(C, A/B)
# Output: -4.0 -3.5