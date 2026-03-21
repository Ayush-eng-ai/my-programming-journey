# Conditional Statements in
# if-elif-else(SYANTAX)

'''if(condition):
    Statement1
elif(condition):
    Statement2
else:
    StatementN'''


      # Traffic Light Code
light = input("light : ")
if(light =="Red"):
    print("Stop")
elif(light =="Yellow"):
    print("Get Ready")
elif(light =="Green"):
     print("Go")
else:
     print("Light is Broken")

     # Grades of students
marks = int(input("marks : "))
if(marks>=90 and marks<=100):
    print("Grade A")
elif(marks>=80 and marks<90):
    print("Grade B")
elif(marks>=70 and marks<80):
    print("Grade C")
elif(marks>=60 and marks<70):
    print("Grade D")
else:
    print("Fail")



# Conditional Statement 
# Single LineIF / Ternary Operator
# SYANTAX
'''Statement1 if condition else Statement2'''

#1. <var> = <val1> if <condition> else <val2>
food = input("food : ")
result = "Eat it" if food == "Vegetable" or food == "Fruit" else "Don't Eat it"
print(result)

# 2. <stt1> if <condition> else <stt2>
# Example
food = input("food : ")
print('sweet') if food == "cake" or food  == "jalebi" else print("not Sweet")

#3. Clever if/Ternary Operator
# <var> = (false_val,true_val)[<condition>]
#Example 1
age = int(input("age: "));
vote = ("yes", "no") [age<18]
print(vote)

#Example 2
sal =float(input("Salary : "))
tax = sal*(0.1, 0.2) [sal <= 50000]
print(tax)



    