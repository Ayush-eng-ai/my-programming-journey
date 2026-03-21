# # File I/O in Python
# '''
# Docstring for Chapter_6.file

#     Python can be used to perform opreration on a file.(read & write data)
        
#         Type of all files
#         1. Text Files: .text, .docx, .log etc.
#         2. Binary Files : .mp4, .mov, .png, .jpeg etc. 
#     '''


# '''
#     #Open, read & close File
#         We have to open a  file before reading or writing.

#         f = open(" file_name", "made")
#             sample.text             r: read mode
#             demo.docx           w: write mode

#         data = f.read()
#         f.close()
# '''
# f = open("D:\OFF Campuse Learning\Data Scienctist\Data_Analyst_Learning_phases\learn_python_2026\Chapter_6", "rt")

# data = f.read()
# print(data)
# print(type(data))
# f.close()
# # import os
# # print("Current Working Directory:", os.getcwd())
# # print("Files here:", os.listdir())



# import os

# base_dir = os.path.dirname(__file__)
# file_path = os.path.join(base_dir, "demo.txt")

# with open(file_path, "r") as f:
#     data = f.read()
#     print(data)

# '''
#     #Reading a file
#         data = f.read() # reads entire file
#         data = f.readline() #reads one line at a time

# '''

# with open(file_path, "r") as f:
#     data = f.read(6)
#     print(data)


# with open(file_path, "r") as f:
#     data = f.readline()
#     print(data)


# with open(file_path, "r") as f:
#     data = f.readlines()
#     print(data)


f = open("D:\OFF Campuse Learning\Data Scienctist\Data_Analyst_Learning_phases\learn_python_2026\Chapter_6\demo.txt", "r")
# f = open("D:\OFF Campuse Learning\Data Scienctist\Data_Analyst_Learning_phases\learn_python_2026\Chapter_6", "rt")

data = f.read()
print(data)
print(type(data))
f.close()

