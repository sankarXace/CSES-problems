n = int(input())
while(1):
    print(n,end=" ")
    if n==1:
        break
    elif n%2 == 0:
        n=int(n/2)
    else:
        n=int(n*3+1)