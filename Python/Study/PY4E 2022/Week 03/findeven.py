num1,num2 = map(int,input("숫자 2개를 공백으로 구분하여 입력: ").split())

def findeven(n1,n2):
    # n1~n2 사이의 숫자 중 짝수만 출력
    numlist = [num for num in range(n1,n2+1) if num%2 == 0]
    print("짝수만 출력:", *numlist)

    mid = (n1+n2)//2 # 중앙값

    # 중앙값 출력
    if (n1+n2)%2 == 0: # 중앙값이 1개인지 체크
        if mid%2 == 0:   # 중앙값이 짝수 인지 체크
            print("중앙값:",mid)

findeven(num1,num2)