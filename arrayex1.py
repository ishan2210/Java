array1=[10,20,30,40,50]
temp=0
for i in array1:
    if (i==20):
        temp=i
        print(temp)
        div=temp/7
        print(div)
        sub=temp*div/100
        print(sub)
        add=temp+sub
        print(add)

if(div<sub and div<add):
  print("Div is Minimum")
elif (add<sub and add<div):
 print("Add is Minimum")
else:
 print("Sub is Minimum")

if(temp==0):
    print("Element not found")