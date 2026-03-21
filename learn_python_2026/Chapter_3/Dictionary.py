info = {
    "key" : "value",
    "name": "Ayush Rajput",
    "learning": "coding",
    "age":34,
    "is_adult" : True,
    "marks" : 94.4,
    "subject" :["python", "C", "Java"],
    "topics" : ("dict", "set")
}
print(info)
print(type(info))
print(info["subject"])
print(info["name"])

info["name"] = "Ayush" # over write 
info["surname"] = "Rajput"

null_dict = {}
print(null_dict)
null_dict["name"] = "Ayush"


#Dictionary Methods
'''
    myDict.keys() #return all Keys
    myDict.values() #returns all values
    myDict.items() #return all(key,val) pair as tuples
    myDict.get("key") #returns  the key according to value
    myDict.update(newDict) # insert the  specified items to the dictionary
'''
#  myDict.keys() #return all Keys
student ={
    "name" : "Piyush Kumar",
    "subject": {
        "phy":94,
        "chem":56,
        "math": 45,
        "eng": 86
    }
}
print(student.keys())
print(student.values())
print(student.items())
print(student.get("name"))
print(student.update(info))
print(student)

print(student["name"])
print(student.get("name")) 