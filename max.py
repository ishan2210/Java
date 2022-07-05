firstno=int(input("enter the First Value-->"))
secondno=int(input("enter the Second Value-->"))
thirdno=int(input("enter the Third Value-->"))
if (firstno>secondno and firstno>thirdno):
    print("First is maximum")
elif (secondno>thirdno and secondno>firstno):
    print("Second is maximum")

else:
    print("Third is maximum")
    