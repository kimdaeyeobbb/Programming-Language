## 📌 파이썬으로 할 수 있는 일


### 1. 시스템 유틸리티 제작

 - 파이썬은 OS (Window, Linux 등)의 시스템 명령어를 사용할 수 있는 각종 도구를 가지고 있으므로 이를 바탕으로 여러가지 시스템 유틸리티(컴퓨터 사용에 도움을 주는 여러 S/W)를 만드는 데 유리하다. 파이썬을 이용하여 시스템상에서 사용 중인 서로 다른 유틸리티성 프로그램을 하나로 뭉쳐서 큰 힘을 발휘하게 하는 프로그램들을 무수히 만들 수 있다


<br>

### 2.  GUI 프로그래밍

 - 파이썬은 GUI 프로그래밍을 위한 도구들이 잘 갖추어져 있어 GUI 프로그램을 만들기 쉽다. 

   cf) GUI 프로그래밍<br>
  - Graphic User Interface 프로그래밍이란, 화면에 또 다른 윈도우 창을 만들고 그 창에 프로그램을 동작시킬 수 있는 메뉴나 버튼, 그림 등을 추가하는 것이다. 


    ex) Tkinter <br>
   - 파이썬 프로그램과 함께 설치되며, 이를 이용하면 단 5줄의 소스 코드만으로 윈도우 창을 띄울 수 있다


<br>

### 3. C/C++과의 결합

 - 파이썬에서 만든 프로그램은 C/C++에서 사용할 수 있으며 반대의 케이스 또한 가능하다. 이렇듯, 다른 언어와 잘 어울려 결합해서 사용이 가능하므로 파이썬은 접착(glue)언어라고도 부른다.


<br>



### 4. 웹 프로그래밍

 - 파이썬으로 웹 프로그램을 만들 수 있다

 - cf) 웹 프로그램<br>
 크롬, 파이어폭스, 엣지 등 인터넷을 사용하여 웹 서핑을 하면서 게시판이나 방명록 등에 글을 남길때 '게시판'이나 '방명록'을 웹 프로그램이라 한다.



<br>



### 5. 수치 연산 프로그래밍

 - 파이썬에서 제공하는 Numpy 수치 연산 모듈을 통해 수치 연산을 프로그래밍 할 수 있다.<br>
 (Numpy는 C언어로 작성되었으며, 수치가 복잡하고 연산이 많을 경우 C언어로 작성하는 것이 더 빠르다)


<br>


### 6. 데이터베이스 프로그래밍

 - 파이썬은 사이베이스(Sybase), 인포믹스 (Infomix), 오라클 (Oracle), MySQL, 포스트그레스큐엘 (PostgreSQL)등의 데이터베이스에 접근하기 위한 도구를 제공한다.<br>
 또한 pickle이라늠 모듈을 통해 파이썬 상에서 사용하는 자료를 변형 없이 그대로 파일에 저장하고 불러올 수 있다.


<br>

### 7. 데이터 분석

 - 파이썬으로 만든 Pandas라는 모듈을 사용하여 데이터 분석을 더 쉽고 효과적으로 수행할 수 있다 

<br>


### 8. 사물 인터넷

 - 파이썬은 라즈베리파이를 제어할 수 있는 도구로서 사용할 수 있다. 일례로 라즈베리파이에 연결된 모터를 작동시키거나 LED에 불이 들어오게 하는 일을 파이썬을 통해 수행할 수 있다

 - cf) 라즈베리파이<br>
 리눅스 기반의 아주 작은 컴퓨터이며, 라즈베리 파이를 사용하여 홈시어터나 아주 작은 게임기를 제작할 수 있다



<br><br>


## 📌 파이썬으로 수행할 수 없는 일


### 1. 시스템과 밀접한 영역의 프로그래밍 

 - 파이썬으로 리눅스와 같은 OS나 엄청난 횟수의 반복과 연산이 필요한 프로그램 또는 데이터 압축 알고리즘 개발 프로그램 등을 만드는 것은 어렵다. <br>
 시스템과 밀접한 프로그래밍 영역은 하드웨어를 직접 건드려야 하기 때문에 파이썬은 이에 적절하지 않다. <br>(또한 빠른 속도를 요구하는 프로그램의 경우 파이썬 사용이 적절하지 않다.)

<br>


### 2. 모바일 프로그래밍

 - 아직 파이썬으로는 안드로이드 iOS 앱을 만들기에는 부족하다.


 
 
 
 <br><br><br>

## 📌 H/W Architecture 상 CPU와 Main Memory & Secondary Memory의 역할

 


<p align="center">
  <img src="http://www.vlsifacts.com/wp-content/uploads/2015/07/Computer-Memories.png" alt="Memory Architecutre" title="컴퓨터 메모리 구조" width="600" height="400"/>
</p> 



<br>

- 컴퓨터 전체 메모리 시스템 분류

  1. CPU Register
  2. 캐시 메모리
  3. 메인 메모리
  4. 보조 메모리 / 대용량 저장 장치

<br>

### CPU Register

- 프로세서 내의 메모리 단위임
- CPU는 매우 빠른 속도로 데이터와 명령을 처리함
- 데이터에 대한 작업을 수행하고 중간 결과를 저장하기 위해서는 CPU에 일시적으로 값을 저장할 수 있는 저장 공간이 필요한데 cpu가 이를 제공한다. 



<br>

### 캐시 메모리

- 대부분 SRAM으로 구성된 빠른 속도의 반도체 메모리이다
- 시스템의 성능을 높이는데 사용된다
- 프로세서에서 가장 자주 사용하는 데이터 부분을 임시로 보관한다
- Main memory보다 빠르지만 저장 용량이 제한적이며, 비용이 많이 든다.


<br>

### Main Memory

- 메인 메모리의 기본 구성 요소는 DRAM 셀이다.
- Secondary Memory(보조 메모리)보다 훨씬 빠르지만 캐시 메모리보다 느리다 
- 프로세서에게 실제 작업 공간을 제공한다
- 저장 용량이 제한적이다
- 데이터를 일시적으로 저장한다 (휘발성)
- 따라서 전원이 꺼지면 데이터가 손실된다

<br>

### Secondary Memory 
 
- 외부 메모리 장치이다
- 데이터를 영구적으로 저장한다 (비휘발성)
- 전원이 꺼져도 데이터를 유지한다
- 높은 저장 용량을 가지고 있다 
- Main memory에 비해 매우 느리다
 
<br><br><br>
 

## 📌 SyntaxError, ValueError, TypeError<br><br>① 각각의 Error를 발생시키는 코드를 2가지씩 만들기 & 디버깅한 코드 만들기<br>②  추가 에러 3가지를 찾아 그 Error를 발생시키는 코드 만들기 & 디버깅한 코드 만들기 

 
### Syntax Error

- 파이썬 문법을 지키지 않았을 때 발생하는 에러 
- 인터프리터가 소스 코드를 바이트 코드로 변환하면서 발견됨 
- Syntax Error는 프로그램의 구조에서 잘못된 부분을 알려줌
- 프로그램이 실행되지 않음 (따라서 비교적 쉽게 문제 해결을 할 수 있음)
- 프로그램의 어느 위치에서 에러가 발생헀는지 위치를 알려줌 (단, 항상 그 위치가 일치하는 것은 아님)

- 에러를 발생시키는 코드 예시 1 (for문 끝에 콜론(:)을 삽입하지 않음)
```python
for i in range(10)
    print(i)
```

- 디버깅 결과
```python
  File "<stdin>", line 1
    for i in range(10)
                     ^
SyntaxError: invalid syntax
```


<br>

- 에러를 발생시키는 코드 예시 2 (함수 정의할 때 콜론(:)을 삽입하지 않음)
```python
>>> def myfunction(arg1)
```

- 디버깅 결과
```python
  File "<stdin>", line 1
    def myfunction(arg1)
                       ^
SyntaxError: invalid syntax
```

<br>

### Value Error

- 연산이나 함수가 올바른 형(타입)이지만 부적절한 값을 가진 인자를 받았고, 상황이 IndexError처럼 더 구체적인 예외로 설명되지 않는 경우 발생
- 잘못된 값의 인자를 전달할 경우 발생 (Type Error와의 차이점)
- 자료형은 맞는데 값이 틀릴 경우 발생
- 참조하려는 값이 존재하지 않는 경우 발생

- 에러를 발생시키는 코드 예시 1 (int 자료형에 문자열을 삽입)
```python
>>> int('부산')
```

- 디버깅 결과
```python
Traceback (most recent call last):

    File "<stdin>", line 1, in <module>

ValueError: invalid literal for int() with base 10: '부산'
```

<br>
 
- 에러를 발생시키는 코드 예시 2 (참조하려는 값이 리스트에 포함되어 있지 않은 경우)
```python
>>> listexample = [10,20,30,40]
>>> listexample.remove(50)
```
 
- 디버깅 결과
```python
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
ValueError: list.remove(x): x not in list
``` 
 
<br>


### Type Error

- 자료형이 맞지 않거나 함수 호출 규약을 
- 연산이나 함수가 부적절한 형(타입)의 객체에 적용될 때 발생 
- 잘못된 형(타입)의 인자를 전달할 경우 발생 (Value Error와의 차이점)
- 객체에 시도된 연산이 지원되지 않으나, 사용자가 의도적으로 발생시킬 수 있다


- 에러를 발생시키는 코드 예시 1 (int형 데이터와 str형 데이터를 연산)
```python
>>> num1 = 25
>>> num2 = '가'
>>> num1 + num2
```

- 디버깅 결과
```python
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
TypeError: unsupported operand type(s) for +: 'int' and 'str'
```

<br>

- 에러를 발생시키는 코드 예시 2 (리스트 인덱싱을 정수가 아닌 실수로 접근)
```python
# 중앙값(값들을 크기순으로 정렬했을 때 가운데 위치하는 값)을 구하는 프로그램

def median(data):
    """데이터의 중앙값을 반환한다."""
    sorted_data = sorted(data)
    median_value = sorted_data[len(sorted_data) / 2]
    return median_value

print(median([10, 9, 4, 1, 5, 7]))
```


- 디버깅 결과
```python
Traceback (most recent call last):
  File "exercise_9_1.py", line 7, in <module>
    print(median([10, 9, 4, 1, 5, 7]))
  File "exercise_9_1.py", line 4, in median
    median_value = sorted_data[len(sorted_data) / 2]
TypeError: list indices must be integers or slices, not float
```


<br>


### FileNotFound Error

- 디렉터리 내에 없는 파일을 열려고 할 때 발생하는 에러

- 에러 발생시키는 코드 예시
```python
>>> f = open("파이썬 실습 파일", 'r')
```

- 디버깅 결과
```python
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
FileNotFoundError: [Errno 2] No such file or directory: '파이썬 실습 파일'
```


<br>



### ZeroDivision Error

- 특정 숫자를 0으로 나눌 때 발생하는 에러

- 에러 발생시키는 코드 예시
```python
>>> 9 / 0
```

- 디버깅 결과
```python
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
ZeroDivisionError: division by zero
```


<br>


### IndexError

- 리스트 내에서 얻을 수 없는 값에 접근하려고 할 때 발생하는 에러

- 에러 발생시키는 코드 예시
```python
>>> korlist = ['가', '나', '다']
>>> korlist[5]
```

- 디버깅 결과
```python
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
IndexError: list index out of range
```

<br>

### Runtime Error
 
- 프로그램을 실행하는 도중에 무엇인가 잘못된 것이 있을 때 인터프리터가 발생시키는 에러
- 대부분 에러가 발생한 위치, 실행 중인 함수 같은 정보를 담고 있음

- 에러 발생시키는 코드 예시 (무한 재귀)
```python
>>> def recurse():
...     recurse()
...
>>> recurse()
```
 
- 디버깅 결과
```python
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
  File "<stdin>", line 2, in recurse
  File "<stdin>", line 2, in recurse
  File "<stdin>", line 2, in recurse
  [Previous line repeated 996 more times]
RecursionError: maximum recursion depth exceeded
```
 
 
 
 <br><br><br>
 
 
 
 
 

## 📌 한국 나이를 미국 나이로 변환하는 프로그램 만들기
### hint: 미국 나이는 생일이 지났는지 여부가 중요함

```python
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
```
