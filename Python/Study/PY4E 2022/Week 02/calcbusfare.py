def busfare(age, method):
    # 지불방법 - 카드
    if method == "카드":
        if age >= 75:
            fare = "무료"
        elif age >= 20:
            fare = "1200원"
        elif age >= 14:
            fare = "720원"
        elif age >= 8:
            fare = "450원"
        else:
            fare = "무료"

    # 지불방법 - 현금
    elif method == "현금":
        if age >= 75:
            fare = "무료"
        elif age >= 20:
             fare = "1300원"
        elif age >= 14:
            fare = "1000원"
        elif age >= 8:
            fare = "450원"
        else:
            fare = "무료"

    # 올바른 지불방법을 선택하지 않은 경우
    else:
        print("카드와 현금 중 하나의 지불방법을 선택해주세요")

    # 결과 출력
    print()
    print(f"나이: {age}, 지불유형: {method}, 버스요금: {fare}")

inputage = int(input("나이를 입력하세요: "))
paymentmethod = input("지불 방법을 입력하세요 (카드/현금): ")

busfare(inputage,paymentmethod)