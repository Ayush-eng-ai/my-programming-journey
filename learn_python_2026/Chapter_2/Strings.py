#String
#String is data type that store a sequence of characters

#Basic Operation
#concatenation
#  "hello" + "world" = "helloworld"

#length of str
#len(str)


str1  = "This  is a String"
str2 = 'Ayush Rajput'
str3 =  """This is  a string"""

str1  = "This  is a String. \n we are creating it in python."
print(str1)
print("Count of letters in this string:", len(str1))

#Escape sequence charactors (\n, \t)


                            ###Indexing

str4 = "Ayush Rajput "
ch = str4[4]
print(ch)




                               ###Slicing
## Two types slicing  1. forword, 2. backword 
#Accessing parts of a string
#str[ start_idx : ending_idx] #ending  index is no include


#1. forword, positive indexing
str = "Ayush Rajput"
#str[1: 4 ] is "yus"
#Str[ :4]  will be  only for str "Ayus"
#Str[4 :]
#Str[4 : len(str)]

#2. backword Slicing , negative indexing
str = "Apple"
a= str[-3:-1] # output "pl"
print(a)




                             ###String Functions
str = "I am coder."
print(str)

str.endswith("er.") # returns true if string ends with substr
print(str.endswith("er."))

str = str.capitalize() #capitalizes 1st char
print(str)

str1 = str.replace("I am coder", "my passion is coding")
print(str1)

str.find("passion") #returns 1st index of occurance
print(str.find("passion") )
str.count("am") #count the occurrence of substr in string
print(str.count("am"))













