import sys

def checkfault(guestbook):
    f = open('question3.txt', 'w')   # 방명록을 넣을 경우 txt 파일로 저장
    for i in range(len(guestbook)):
        # 010으로 시작하는지 체크
        if guestbook[i][1][:3] != "010":
            f.write("번호가 010으로 시작하지 않습니다\n")
            f.write(f'잘못 쓴 사람: {guestbook[i][0]}\n')
            f.write(f'잘못 쓴 번호: {guestbook[i][1]}\n\n')


        # 번호가 -으로 구분되어있는지 체크
        if guestbook[i][1][3] != '-' or guestbook[i][1][8] != '-':
            f.write("번호가 -으로 구분되어있지 않습니다.\n")
            f.write(f'잘못 쓴 사람: {guestbook[i][0]}\n')
            f.write(f'잘못 쓴 번호: {guestbook[i][1]}\n\n')

        # 길이가 13인지 체크
        if len(guestbook[i][1]) != 13:
            f.write("번호의 길이가 13이 아닙니다.\n")
            f.write(f'잘못 쓴 사람: {guestbook[i][0]}\n')
            f.write(f'잘못 쓴 번호: {guestbook[i][1]}\n\n')

    f.close()

print("게스트 정보를 입력하세요")
guestbook = []
while(1):
    guestinfo = sys.stdin.readline().strip()   # 이값이 유효할 때까지 입력받음
    if not guestinfo: break
    guestbook.append(guestinfo.split(','))   # 이름과 번호를 분리하여 저장

checkfault(guestbook)

