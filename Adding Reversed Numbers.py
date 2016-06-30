def rev(n):
    rev = 0
    while(n>0):
        rev = rev*10 + (n%10)
        n = n/10
    return rev
t = input()
while(t>0):
    n = map(int,raw_input().split())
    rev1 = rev(n[0])
    rev2 = rev(n[1])
    print rev(rev1+rev2)
    t-=1


Another method:

def remz(n):
    while(n%10 == 0):
        n = n/10
    return n
t = input()
while(t>0):
    n = map(int,raw_input().split())
    n1 = remz(n[0])
    n2 = remz(n[1])
    rev = int(str(int(str(n1)[::-1])+int(str(n2)[::-1]))[::-1])
    print rev
    t-=1
