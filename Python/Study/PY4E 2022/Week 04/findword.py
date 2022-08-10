def coutingword(words):
    f = open('question2.txt', 'w')  # 파일 생성 - 결과값: 파일 객체
    str = "새로운 과학용어를 만드는 일은 간단하지 않다. " \
          "용어에 담겨있는 개념의 의미를 정확하게 표현하는 것이 가장 중요하다. " \
          "그러나 과학용어도 우리말과 함께 어울릴 수 있어야 한다는 사실도 절대 무시하지 말아야 한다. " \
          "우리말과 어울리지 않는 과학용어는 아무리 정확한 것이라고 도태될 수밖에 없다."
    f.write(f"*기준이 되는 문자열 \n => {str}\n\n")
    wordcount = str.count(str)  # 찾고 싶은 문자열의 개수

    f.write(f"*찾고자하는 문자열: \"{words}\"\n => {wordcount}개 존재")

    f.close()  # 파일객체 닫아줌

findstr = input("찾고 싶은 문자열을 입력하세요: ")
coutingword(findstr)