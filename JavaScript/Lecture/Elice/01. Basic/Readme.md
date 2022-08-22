# 01. 자바스크립트란

- 웹 페이지에서 이미지를 슬라이드하는 효과, 팝업 효과등을 포함한 동적인 웹 사이트를 제작할 때 사용하는 프로그래밍 언더

## 활용범위

- Iot, 하이브리드 앱 (WEB+Mobile), 서버 개발

### 동적인 웹 사이트?
  - 사이트가 변함, 사용자와의 상호 작용

## html

- 웹 사이트의 구조를 잡음

## css

- 웹 사이트를 꾸며줌


# 02. 자바스크립트의 변수

## 변수

- 변수
    - 데이터를 담는 공간

```javascript
var fruit;   // 변수선언
fruit = "apple"   // 변수 초기화
var fruit = "apple";   // 변수 선언 및 초기화
```

- 변수 선언
    - 데이터를 담을 공간(그릇)을 생성하는 것 

- 변수 초기화
    - 생성된 변수에 데이터를 전달하는 것



- console.log();
    - 변수 안에 데이터를 확인할 때 사용  
    - 변수의 데이터를 콘솔에서 확인할 때 사용


- 주의사항

1. 변수명은 숫자로 시작할 수 없음
2. 변수명은 최대한 자세하게 작성할 것
3. 의미가 불명확한 단어들의 조합은 피할것


- document.write()
    - 변수의 데이터를 웹 화면에 출력하기 위해 사용


<br>

# 03. 데이터 타입

## 배열

- 비슷한 성격을 갖고 있는 데이터를 하나의 변수 안에서 관리하기 위한 데이터 타입

<br>

## 객체(Object)

- 배열과 마찬가지로 여러개의 데이터를 담을 때 사용하는 데이터 타입

- (배열과의 차이점) property, 값 또는 property, method, data로 구성되어 있음

### property에 접근하기

1. student.name = "park"
2. student["name"] = "park"

<br>

## undefined & null

- undefined 
  - 변수 내에 데이터가 정의되지 않은 것
  
- null
  - 개발자가 임의로 데이터를 비워놓은 것

```js
var st1;   // undefined -> 변수를 선언하였으나 값을 넣지 않았음 (정의되지 않음)
var st2 = null;   // null -> null 
```




<br>


## boolean

- 참/거짓에 대한 정보를 담고 있는 데이터 타입

<br><br>


# 04. 프로퍼티와 메서드

## 데이터 타입의 프로퍼티와 메서드

- js에서 사용자를 위해 사전에 작성된 편의 기능

### 문자열 프로퍼티와 메서드

```js
var str1 = "black shirt";

str1.length;   // 문자열 길이를 추출할 때 사용
str1.charAt(0);   // charAt 프로퍼티 -> 문자 추출할 때 사용
str1.split(" ");   // split 메서드 -> 공백 기준으로 문자열을 나눔 (이후 배열["black","shirt"]로 출력)
```
<br>

### 배열의 프로퍼티와 메서드
```js
var fruit = ["사과", "배", "포도"];

fruit.length;   // length 프로퍼티 -> 데이터의 개수 나타냄
fruit.push("딸기");   // push 메서드 ->  배열 뒤에 데이터 삽입
fruit.unshift("레몬");   // unshift 메서드 -> 배열 앞에 데이터 삽입

fruit.pop();   // 배열 뒤에 데이터 제거
fruit.shift();    // 배열 앞의 데이터 제거
```

<br>

### math의 수학 연산 메서드

```js
Math.abs(-5);   // abs 메서드 -> 절대값 반환
Math.ceil(0.2);   // ceil 메서드 -> 올림
Math.floor(9.3);   // floor 메서드 -> 내림
Math.random();   // 
```

<br>

### 문자를 숫자로 변환하는 메서드

```js
parseInt("10.7");   // 정수 형태로 반환
parseFloat("10.7");   // 실수 형태로 반환
```

<br>


### 추가 내용

#### .charAt(n) 메서드

- 문자열 객체의 n번째 문자를 추출하기 위해서 사용

<br>

#### .pop() 

- 배열 객체의 맨 뒤의 데이터를 제거하기 위해 사용


<br>

#### 함수 만들고 호출하기


```js
/* 맞는 표현 */
function solution() {
  function add(x, y) {
    return x + y;
  }
  return add;
}

/* 틀린 표현 */
function solution() {
  function add(x, y) {
    return x + y;
  }
  return add();
}
```

- 함수 안에서 함수를 리턴하고 싶은 경우, 함수를 호출하지 않고 함수명만 적도록 하자

<br>

