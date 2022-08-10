def addcomma(num):
    numlist = list(num)   # 숫자 하나씩 쪼개서 리스트에 삽입

    commaidx = -1
    for i in range(len(numlist),0,-1):
        commaidx += 1
        if commaidx!=0 and commaidx%3 == 0:
            numlist.insert(i,',')
    return(''.join(numlist))

n = input("숫자를 입력하세요: ")
print(addcomma(n))