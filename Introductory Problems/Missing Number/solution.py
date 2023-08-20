n = int(input())
seen = set(map(int,input().split(" ")))
for i in range(1,n+1):
    if i not in seen:
        print(i)
        break