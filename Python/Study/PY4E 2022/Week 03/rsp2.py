import random

numofgame = int(input("진행할 게임 횟수 입력: "))
rsplist = ["가위","바위","보",0,1,2]

def makersp(rsp):   # 가위, 바위, 보 대결을 위한 변환 작업
    if rsp == '0' or "가위":
        rsp = "가위"
    elif rsp == '1' or "바위":
        rsp = "바위"
    elif rsp == '2' or "보":
        rsp = "보"
    return rsp

def dorsp():   # 가위, 바위, 보 시행
    i=0
    round = 1;  # 가위, 바위, 보 라운드
    com_win = 0; draw = 0; user_win = 0;
    while (i<numofgame):
        print()
        print("*** 가위 바위 보 게임을 시작합니다 ***")
        print("*** ROUND %d ***" %(round))
        com = random.choice(["가위", "바위", "보"])   # 가위(0), 바위(1), 보(2) 중 택 1
        user = input("가위(0), 바위(1), 보(2) 중 하나를 입력: ")

        try:
            if user in rsplist:
                user = makersp(user)  # 0,1,2 입력한 경우 '가위','바위','보'로 변환
            else:  # 가위(0), 바위(1), 보(2)가 아닌 경우
                raise ValueError("오류가 발생했습니다")  # 오류를 발생시킴
        except ValueError:  # except: 오류발생시 해야할 일 기재, ValueError: 값 오류로 처리
            print("가위(0), 바위(1), 보(2) 중 하나를 다시 입력하세요")
            continue   # 다시 위로올라가서 입력받음


        if com == user:   # 비긴 경우
            draw += 1
            print("컴퓨터: %s" %(com))
            print("사용자: %s" %(user))
            print("비겼습니다")
        elif (com == "가위" and user == "바위") or \
                (com == "바위" and user == "보") or \
                (com == "보" and user == "가위"):   # 사용자가 이긴 경우
            user_win += 1
            print("컴퓨터: %s" % (com))
            print("사용자: %s" % (user))
            print("사용자가 승리했습니다")
        else:
            com_win += 1
            print("컴퓨터: %s" % (com))
            print("사용자: %s" % (user))
            print("컴퓨터가 승리했습니다")

        print()
        print("*** %d번째 판 종료 ***" %round)
        print("컴퓨터의 전적: %d승 %d무 %d패" %(com_win, draw, user_win))
        print("사용자의 전적: %d승 %d무 %d패" %(user_win,draw, com_win))
        i += 1; round +=1;

dorsp()