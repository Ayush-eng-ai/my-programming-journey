#let's Practice
#WAP to ask the user to enter namesof their 3 favorite movies & store them in a list.

# movie_name = map(str,input("Enter a movie names: ").split(','))
# print(list(movie_name))


#Ques 2 WAP to check if a list contains a palindrome of elements.(Hint: use copy() method)

Pal = list(map(str,input("Enter a words: ").split(',')))
print(list(Pal))
copy_Pal = Pal.copy()
copy_Pal.reverse()
if(Pal==copy_Pal):
	print("It's a palindrome")
else:
	print("It's not a palindrome")
	
	
# print(list.copy(Pal))
# print(list.reverse(Pal))

if(Pal == Pal[::-1]):
	print("It's a palindrome")
else:
	print("It's not a palindrome")


#Ques.3 WAP to count number of student with the "A grade in the following tuple."
grade = ["C", "D", "A", "C", "A", "A", "B", "B"]
#store the above values in a list & sort them from "A" to "D".
grade.sort()
print(grade)

