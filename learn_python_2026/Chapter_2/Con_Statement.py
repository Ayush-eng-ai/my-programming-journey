# Conditional Statements
#if-elif-else(SYANTAX)

'''if(condition):
    Statement1
elif(codition):
    Statement2
else:
    StatementN '''

age = 21

if(age>=18):
    print("Can Vote & Apply for License")
    print("Can drive")
else:
    print("Can't Vote & Apply for License")
    print("Can't drive")


#Ques Grade students based on marks
 
marks = int(input("Enter a Marks:"))
if(marks>=90):
    print("A Grade")
elif(90> marks>= 80):
    print("B Grade")
elif(80 > marks >=70):
    print("C Grade")
elif(70> marks >= 60):
    print("D Grade")
else:
    print("fail")


#Nesting Statements
age = int(input("Enter a age: "))
if(age>=18):
    if(age >= 80):
        print("cannot drive")
    else:
        print("Can Vote & Apply for License")
        print("Can drive")
else:
    print("Can't Vote & Apply for License")
    print("Can't drive")



