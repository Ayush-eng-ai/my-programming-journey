#Let's Practice 
'''
    Ques1: Store following word meanings in a python dictionary:
        table: "a piece of furniture", "list of facts & figures"
        cat: "a small animal"
'''

dict= {
    "table": ["a piece of furniture" , "list of facts & figures"],
    "cat": "a small animal"
}
print(dict)

'''
    #Ques2: You are given a list of subjects for students. Assume one classroom is required for 1 subject. How many classrooms are needed by all students.
        “python”, “java”, "C++", “python”, “javascript”, 
        “java”, “python”, “java”, "C++", "C”
'''

class_room = { "python", "java", "C++", "python", "javascript", 
        "java", "python", "java", "C++", "C" }
print(len(class_room))


'''
    #Ques3: WAP to enter marks of 3 subjects from the user and store them in a dictionary. Start with an empty dictionary & add one by one. Use subject name as key & marks as value.
'''
marks = {}


x = int(input("Enter a Phy. : "))
marks.update({"phy": x})
y = int(input("Enter a chem. : "))
marks.update({"chem": y})
z = int(input("Enter a math. : "))
marks.update({"math": z})

print(marks)







'''
    #Ques4: Figure out a way to store 9 & 9.0 as separate values in the set.
                You can take help of built-in data types
'''
        # Possible solution first
value ={"9", 9.0}
print(value)

        # Possible solution  second
value ={9, "9.0"}
print(value)


        # Possible solution Third 
value ={
    ("float",9.0), ("int",9)
}
print(value)
