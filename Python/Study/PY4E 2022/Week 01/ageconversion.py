birthdate = input().split()   # 생년월일 - 1999 01 26 꼴로 입력
presentdate = input().split()   # 현재시각 - 2022 07 18 꼴로 입력
afterbirth = False   # 생일이 지났는지 여부
birthdate = list(map(int,birthdate))  # 리스트 요소 정수 변환
presentdate = list(map(int,presentdate))   # 리스트 요소 정수 변환

if birthdate[2] >= presentdate[2]: # 일자가 지나지 않은 경우
    if birthdate[1] >= presentdate[1]: # 월이 지나지 않은 경우
        afterbirth = False   # 생일이 지나지 않았음
    else:
        afterbirth = True   # 생일이 지남
else:   # 일자가 지난 경우
    if birthdate[1] > presentdate[1]:   # 월이 지나지 않은 경우
        afterbirth = False
    else:   # 월이 지난 경우
        afterbirth = True

korage = presentdate[0]-birthdate[0]+1   # 한국식 나이 입력
usage = 0   # 미국식 나이

if afterbirth:  # 생일이 지난 경우
    usage = korage-1
else:   # 생일이 지나지 않은 경우
    usage = korage-2

print("생년월일: %d년 %d월 %d일, 한국식 나이: %d세, 미국식 나이: %d세" %(birthdate[0],birthdate[1],birthdate[2],korage,usage))